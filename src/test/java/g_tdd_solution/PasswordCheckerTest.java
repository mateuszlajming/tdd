package g_tdd_solution;

import static org.assertj.core.api.Assertions.assertThat;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class PasswordCheckerTest {

  PasswordChecker passwordChecker = new PasswordChecker();

  @Test
  @Parameters({
      "a,false",
      "sdfghjkl,false",
      "Sdfghjkl,false",
      "asdfjkl1,false",
      "Asdfjkl1,false",
      "Asdfjkl1!,true",
      "Asdfjkl1@,true",
      "Asdfjkl1#,true",
      "Asdfjkl1$,true",
      "Asdfjkl1%,true",
      "Asdfjkl1&,true",
      "Asdfjkl1*,true",
  })
  public void checkPassword(String password, boolean expected) {
    assertThat(passwordChecker.checkPassword(password)).isEqualTo(expected);
  }
}
