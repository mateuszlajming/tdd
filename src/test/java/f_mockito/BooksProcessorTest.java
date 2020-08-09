package f_mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class BooksProcessorTest {

  Database mockedDatabase;
  BooksProcessor booksProcessor;

  @Before
  public void before() {
    mockedDatabase = mock(Database.class);
    booksProcessor = new BooksProcessor(mockedDatabase);
  }

  @Test
  public void getTotalPrice_whenThereAreNoBooksInTheDatabase_shouldReturn0() {
    double totalPrice = booksProcessor.getTotalPrice();

    Assertions.assertThat(totalPrice).isEqualTo(0);
  }

  @Test
  public void getTotalPrice_whenThereIsOneBookInTheDatabase_shouldReturnItsPrice() {
    Book book = new Book("Hobbit", 35.5);
    ArrayList<Book> listOfBooks = new ArrayList<>();
    listOfBooks.add(book);
    when(mockedDatabase.getBooks()).thenReturn(listOfBooks);

    double totalPrice = booksProcessor.getTotalPrice();

    Assertions.assertThat(totalPrice).isEqualTo(35.5);
  }

  @Test
  public void getTotalPrice_whenThereAreTwoBooksInTheDatabase_shouldReturnTotalPrice() {
    List listOfBooks = List.of(
        new Book("Lot na kukułczym gniazdem", 12.4),
        new Book("Biblia", 1000)
    );
    when(mockedDatabase.getBooks()).thenReturn(listOfBooks);

    double totalPrice = booksProcessor.getTotalPrice();

    Assertions.assertThat(totalPrice).isEqualTo(1012.4);
  }



}