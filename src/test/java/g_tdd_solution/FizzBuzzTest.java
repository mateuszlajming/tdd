package g_tdd_solution;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FizzBuzzTest {
  FizzBuzz fizzBuzz = new FizzBuzz();

  @Test
  public void fizzBuzz_whenPassing3_shouldReturnFizz() {
    String ret = fizzBuzz.fizzBuzz(3);

    Assertions.assertThat(ret).isEqualTo("Fizz");
  }

  @Test
  public void fizzBuzz_whenPassing9_shouldReturnFizz() {
    String ret = fizzBuzz.fizzBuzz(9);

    Assertions.assertThat(ret).isEqualTo("Fizz");
  }

  @Test
  public void fizzBuzz_whenPassing5_shouldReturnBuzz() {
    String ret = fizzBuzz.fizzBuzz(5);

    Assertions.assertThat(ret).isEqualTo("Buzz");
  }

  @Test
  public void fizzBuzz_whenPassing10_shouldReturnBuzz() {
    String ret = fizzBuzz.fizzBuzz(10);

    Assertions.assertThat(ret).isEqualTo("Buzz");
  }

  @Test
  public void fizzBuzz_whenPassing15_shouldReturnFizzBuzz() {
    String ret = fizzBuzz.fizzBuzz(15);

    Assertions.assertThat(ret).isEqualTo("FizzBuzz");
  }

  @Test
  public void fizzBuzz_whenPassing30_shouldReturnFizzBuzz() {
    String ret = fizzBuzz.fizzBuzz(30);

    Assertions.assertThat(ret).isEqualTo("FizzBuzz");
  }

  @Test
  public void fizzBuzz_whenPassingOtherNumbers_shouldReturnOther() {
    String ret = fizzBuzz.fizzBuzz(8);

    Assertions.assertThat(ret).isEqualTo("Other");
  }

}
