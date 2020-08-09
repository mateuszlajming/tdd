package f_mockito;

import static org.mockito.Mockito.verify;

import java.util.LinkedList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockitoAnnotationTest {

  @Mock
  LinkedList linkedList;

  @Test
  public void test() {
    linkedList.add("one");
    linkedList.clear();

    verify(linkedList).add("one");
    verify(linkedList).clear();
  }

}
