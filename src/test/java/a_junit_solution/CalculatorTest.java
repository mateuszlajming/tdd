package a_junit_solution;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {

  Calculator calculator = new Calculator();

  @BeforeClass
  public static void beforeClass() {
    System.out.println("przed wszystkimi");
  }

  @AfterClass
  public static void afterClass() {
    System.out.println("po wszystkich");
  }

  @Before
  public void before() {
    System.out.println("przed testem");
  }

  @After
  public void after() {
    System.out.println("po teście");
  }

  @Test
  public void add_whenAdding2Plus2_shouldReturn4() {
    Integer expected = 4;
    assertEquals(expected, calculator.add(2, 2));
  }

  @Test
  public void substract_whenSubstracting6From8_shouldReturn2() {
    Integer expected = 2;
    assertEquals(expected, calculator.substract(8, 6));
  }

  @Test
  public void multiply_3Times3_shouldReturn9() {
    Integer expected = 9;
    assertEquals(expected, calculator.multiply(3, 3));
  }

  @Ignore
  @Test
  public void divide_divide20By4_shouldReturn5() {
    Integer expected = 5;
    assertEquals(expected, calculator.divide(20, 4));
  }

}
