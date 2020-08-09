package f_mockito;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import java.util.LinkedList;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SpyTest {

  @Spy
  LinkedList spyList;

  @Test
  public void test() {
    //List list = new LinkedList();
    //List spyList = spy(list);

    //List spyList = spy(LinkedList.class);

    spyList.add("one");
    spyList.add("two");

    System.out.println(spyList.get(0));  // one

    verify(spyList).add("one");
    verify(spyList).add("two");
  }

}
