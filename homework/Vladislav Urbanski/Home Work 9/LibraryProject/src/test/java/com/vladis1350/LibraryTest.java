package com.vladis1350;

import com.vladis1350.bean.Book;
import com.vladis1350.bean.Library;
import com.vladis1350.configurations.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LibraryTest {

    AnnotationConfigApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(SpringConfig.class);

    Book bookOne = applicationContext.getBean("bookOne", Book.class);
    Book bookThree = applicationContext.getBean("bookThree", Book.class);
    Library library = applicationContext.getBean("library", Library.class);

    public void addBookShouldAddedBookInTheListBook() throws Exception {

        int expectedBeforeAdding = 0;
        int expectedAfterAdding = 1;

        int actualBefore = library.getListBook().size();

        library.addBook(bookOne);
        int actualAfter = library.getListBook().size();

        assertEqualInteger(expectedBeforeAdding, actualBefore, "addBookShouldAddedBookInTheListBook before adding");
        assertEqualInteger(expectedAfterAdding, actualAfter, "addBookShouldAddedBookInTheListBook after adding");
    }

    public void removeBookShouldAddedDeleteFromBookList() throws Exception {

        int expectedBeforeAdding = 1;
        int expectedAfterAdding = 0;

        library.addBook(bookOne);
        int actualBefore = library.getListBook().size();
        library.removeBook(bookOne);

        int actualAfter = library.getListBook().size();

        assertEqualInteger(expectedBeforeAdding, actualBefore, "removeBookShouldAddedDeleteFromBookList before adding");
        assertEqualInteger(expectedAfterAdding, actualAfter, "removeBookShouldAddedDeleteFromBookList after adding");
    }

    public void findByNameShouldFindABookByName() throws Exception {

        Book expectedBook = bookThree;

        library.addBook(bookOne);
        library.addBook(bookThree);
        Book actualBook = library.findByName("Captain's daughter");

        assertEqualBookObject(expectedBook, actualBook, "findByNameShouldFindABookByName");
    }

    private void assertEqualInteger(int expected, int actual, String description) throws Exception {
        if (expected != actual) {
            throw new Exception(description + " has failed! \n" +
                    "Expected " + expected + " but was " + actual);
        } else {
            System.out.println(description + " has passed!");
        }
    }

    private void assertEqualBookObject(Book expected, Book actual, String description) throws Exception {
        if (!expected.equals(actual)) {
            throw new Exception(description + " has failed! \n" +
                    "Expected " + expected + " but was " + actual);
        } else {
            System.out.println(description + " has passed!");
        }
    }
}
