package e_stub_solution;

import org.junit.Test;

public class MyClassTest {

  @Test
  public void test() {
    Logger simpleLogger = new SimpleLogger();
    MyClass myClass = new MyClass(simpleLogger);
    myClass.doSomething();

    Logger loggerWithPrefix = new LoggerWithPrefix();
    MyClass myClass1 = new MyClass(loggerWithPrefix);
    myClass1.doSomething();
  }


}
