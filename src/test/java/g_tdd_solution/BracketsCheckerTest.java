package g_tdd_solution;

import static org.assertj.core.api.Assertions.assertThat;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import junitparams.naming.TestCaseName;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class BracketsCheckerTest {

  BracketsChecker bracketsChecker;

  @Before
  public void before() {
    bracketsChecker = new BracketsChecker();
  }

  @Test
  @Parameters({
      "[],true",
      "[][],true",
      "[[]],true",
      "[[[][]]],true",
      "][,false",
      "][][,false",
      "[][]][,false"
  })
  @TestCaseName("{index}: {0} -> {1}")
  public void check(String s, boolean expected) {
    assertThat(bracketsChecker.check(s)).isEqualTo(expected);
  }
}
