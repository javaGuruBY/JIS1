import com.vladis1350.bean.Book;
import com.vladis1350.exception.ItemNotFoundException;
import com.vladis1350.service.RepositoryBook;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Assert.*;
public class BookRepositoryTest {

    @Test
    public void testShouldSaveBookInMap() {
        RepositoryBook repositoryBook = new RepositoryBook();

        Book book = new Book(1l, "Book one", "Author one", 122);
        int expectedLengthBefore = 0;
        int expectedLengthAfter = 1;
        int actualLengthBefore = repositoryBook.findAll().size();
        repositoryBook.save(book);

        int actualLengthAfter = repositoryBook.findAll().size();
        Assert.assertEquals(expectedLengthBefore, actualLengthBefore);
        Assert.assertEquals(expectedLengthAfter, actualLengthAfter);
    }

    @Test
    public void testShouldFindAllById() throws ItemNotFoundException {
        RepositoryBook repositoryBook = new RepositoryBook();

        Book book = new Book(1l, "Book one", "Author one", 122);
        Book book1 = new Book(2l, "Book two", "Author two", 1122);
        repositoryBook.save(book);
        repositoryBook.save(book1);
        Book expected = book1;

        Book actual = repositoryBook.findById(2l);
        Assert.assertEquals(expected, actual);
    }

    @Test(expected = ItemNotFoundException.class)
    public void testShouldReturnException() throws ItemNotFoundException {
        RepositoryBook repositoryBook = new RepositoryBook();

        repositoryBook.findById(2l);
    }
}
