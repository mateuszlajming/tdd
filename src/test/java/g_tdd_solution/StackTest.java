package g_tdd_solution;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.Before;
import org.junit.Test;

public class StackTest {

  Stack stack;

  @Before
  public void before() {
    stack = new Stack(10);
  }

  @Test(expected = EmptyStackException.class)
  public void pop_whenTryingToGetElementFromEmptyStack_shouldThrowEmptyStackException() {
    stack.pop();
  }

  @Test
  public void pop_whenThereWasOneElementAdded_shouldReturnThatElementAndRemoveItFromTheStack() {
    String element = "bla";
    stack.push(element);
    assertThat(stack.pop()).isEqualTo(element);
    assertThatExceptionOfType(EmptyStackException.class).isThrownBy(() -> {
      stack.pop();
    });
  }

  @Test
  public void peek_whenThereWasOneElementAdded_shouldReturnThatElementEverytimeItIsCalled() {
    String element = "bla";
    stack.push(element);
    assertThat(stack.peek()).isEqualTo(element);
    assertThat(stack.peek()).isEqualTo(element);
  }

  @Test
  public void pop_whenThereWereTwoElementsAdded_shouldReturnThoseTwoElementsInProperOrderAndRemoveThemFromTheStack() {
    String element1 = "bla";
    String element2 = "alb";
    stack.push(element1);
    stack.push(element2);
    assertThat(stack.pop()).isEqualTo(element2);
    assertThat(stack.pop()).isEqualTo(element1);
    assertThatExceptionOfType(EmptyStackException.class).isThrownBy(() -> {
      stack.pop();
    });
  }
}

