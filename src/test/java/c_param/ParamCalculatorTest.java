package c_param;

import a_junit_solution.Calculator;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.naming.TestCaseName;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class ParamCalculatorTest {

  @Test
  @Parameters( {
      "2, 2, 4",
      "4, 5, 9",
      "3, 4, 7"
  })
  @TestCaseName("[{index}] {method}: {0} + {1} = {2}")
  public void testAdd(Integer a, Integer b, Integer expected) {
    Calculator calculator = new Calculator();

    Integer sum = calculator.add(a, b);

    Assert.assertEquals(expected, sum);
  }

}
