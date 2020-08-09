package g_tdd_solution;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.Before;
import org.junit.Test;

public class QueueTest {

  Queue queue;

  @Before
  public void before() {
    queue = new Queue(10);
  }

  @Test(expected = EmptyQueueException.class)
  public void peek_whenNoElementsWereAddedToTheQueue_shouldThrowEmptyQueueException() {
    queue.peek();
  }

  @Test(expected = EmptyQueueException.class)
  public void dequeue_whenNoElementsWereAddedToTheQueue_shouldThrowEmptyQueueException() {
    queue.dequeue();
  }

  @Test(expected = FullQueueException.class)
  public void enqueue_whenMaxSizeIsSetTo0_shouldThrowFullQueueException() {
    queue = new Queue(0);
    queue.enqueue("bla");
  }

  @Test
  public void peek_whenOneElementWasPreviouslyAddedToTheQueue_shouldReturnThatElement() {
    String element = "bla";
    queue.enqueue(element);
    assertThat(queue.peek()).isEqualTo(element);
  }

  @Test
  public void deque_whenOneElementWasPreviouslyAddedToTheQueue_shouldReturnThatElementAndRemoveItFromTheQueue() {
    String element = "bla";
    queue.enqueue(element);
    assertThat(queue.dequeue()).isEqualTo(element);
    assertThatExceptionOfType(EmptyQueueException.class).isThrownBy(() -> {
      queue.dequeue();
    });
  }

  @Test
  public void deque_whenTwoElementWerePreviouslyAddedToTheQueue_shouldReturnThoseElementsInProperOrderAndRemoveThemFromTheQueue() {
    String element1 = "bla";
    String element2 = "alb";
    queue.enqueue(element1);
    queue.enqueue(element2);

    assertThat(queue.dequeue()).isEqualTo(element1);
    assertThat(queue.dequeue()).isEqualTo(element2);
    assertThatExceptionOfType(EmptyQueueException.class).isThrownBy(() -> {
      queue.dequeue();
    });
  }

}
