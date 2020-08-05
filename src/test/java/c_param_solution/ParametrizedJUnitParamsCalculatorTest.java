package c_param_solution;

import static org.junit.Assert.assertEquals;

import a_junit_solution.Calculator;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.naming.TestCaseName;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class ParametrizedJUnitParamsCalculatorTest {

  @Test
  @Parameters({
      "2, 2, 4",
      "1, 3, 4",
      "4, 5, 9"})
  @TestCaseName("[{index}] {method}: {0} + {1} = {2}")
  public void add(Integer a, Integer b, Integer expectedSum) {
    Calculator calculator = new Calculator();

    Integer sum = calculator.add(a, b);

    assertEquals(expectedSum, sum);
  }

  @Test
  @Parameters({
      "2, 2, 0",
      "3, 1, 2",
      "5, 2, 3"})
  @TestCaseName("[{index}] {method}: {0} - {1} = {2}")
  public void subtract(Integer a, Integer b, Integer expectedDifference) {
    Calculator calculator = new Calculator();

    Integer difference = calculator.substract(a, b);

    assertEquals(expectedDifference, difference);
  }

  @Test
  @Parameters({
      "2, 2, 4",
      "3, 1, 3",
      "5, 2, 10"})
  @TestCaseName("[{index}] {method}: {0} * {1} = {2}")
  public void multiply(Integer a, Integer b, Integer expectedProduct) {
    Calculator calculator = new Calculator();

    Integer product = calculator.multiply(a, b);

    assertEquals(expectedProduct, product);
  }

  @Test
  @Parameters({
      "2, 2, 1",
      "3, 1, 3",
      "10, 2, 5"})
  @TestCaseName("[{index}] {method}: {0} / {1} = {2}")
  public void divide(Integer a, Integer b, Integer expectedQuotient) {
    Calculator calculator = new Calculator();

    Integer quotient = calculator.divide(a, b);

    assertEquals(expectedQuotient, quotient);
  }

}

