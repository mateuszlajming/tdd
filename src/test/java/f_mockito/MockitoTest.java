package f_mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.LinkedList;
import java.util.List;
import org.junit.Test;

public class MockitoTest {

  @Test
  public void test() {
    //List mockedList1 = Mockito.mock(List.class);

    List mockedList = mock(List.class);

    mockedList.add("add");
    mockedList.clear();
    mockedList.isEmpty();

    verify(mockedList).add("add");
    verify(mockedList).clear();
    verify(mockedList).isEmpty();
  }

  @Test
  public void test2() {
    LinkedList mockedList = mock(LinkedList.class);

    when(mockedList.get(0)).thenReturn("first");

    System.out.println(mockedList.get(0));      // first
    System.out.println(mockedList.get(999));    // null
    System.out.println(mockedList.get(10000));  // null

    when(mockedList.get(anyInt())).thenReturn("element");

    System.out.println(mockedList.get(0));      // element
    System.out.println(mockedList.get(999));    // element
    System.out.println(mockedList.get(10000));  // element

    when(mockedList.get(0)).thenReturn(";alskdfhja;lskdfj;alskdfj");

    System.out.println(mockedList.get(0));
    System.out.println(mockedList.get(999));
    System.out.println(mockedList.get(10000));

    when(mockedList.get(666))
        .thenThrow(new RuntimeException("El Diablo"));

    try {
      mockedList.get(666);
      fail("Expected an exception");
    } catch (Exception e) {
      assertThat(e.getMessage()).isEqualTo("El Diablo");
    }
  }

  @Test
  public void test3() {
    LinkedList mockedList = mock(LinkedList.class);

    mockedList.add("once");

    mockedList.add("twice");
    mockedList.add("twice");

    mockedList.add("three times");
    mockedList.add("three times");
    mockedList.add("three times");

    verify(mockedList).add("once");

    verify(mockedList, times(1)).add("once");

    verify(mockedList, times(2)).add("twice");

    verify(mockedList, times(3)).add("three times");

    verify(mockedList, never()).add("never");

    verify(mockedList, atLeastOnce()).add("three times");
    verify(mockedList, atLeast(1)).add("three times");
    verify(mockedList, atLeast(2)).add("three times");
    verify(mockedList, atLeast(3)).add("three times");

    verify(mockedList, atMost(3)).add("three times");

    //verify(mockedList, atMost(2)).add("three times");
  }

}
