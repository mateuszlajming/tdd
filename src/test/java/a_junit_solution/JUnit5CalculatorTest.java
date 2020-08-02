package a_junit_solution;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class JUnit5CalculatorTest {

  Calculator calculator;

  @Test
  public void add_whenAdding2Plus2_shouldReturn4() {
    Integer expected = 4;
    assertEquals(expected, calculator.add(2,2));
  }

  @Test
  public void substract_whenSubstracting6From8_shouldReturn2() {
    Integer expected = 2;
    assertEquals(expected, calculator.substract(8,6));
  }

  @Test
  public void multiply_3Times3_shouldReturn9() {
    Integer expected = 9;
    assertEquals(expected, calculator.multiply(3,3));
  }

  @Test
  public void divide_divide20By4_shouldReturn5() {
    Integer expected = 5;
    assertEquals(expected, calculator.divide(20,4));
  }
}
