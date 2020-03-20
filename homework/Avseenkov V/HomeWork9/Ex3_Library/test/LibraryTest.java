package test;

import bean.Book;
import service.Library;

import java.lang.reflect.Array;

public class LibraryTest {

    Library libraryTest = new Library();
    Book bookTest = new Book("Bla-bla", "Pum-pum");

    public void runTest() throws Exception {
        shouldAddBookToLibrary();
    }

    void shouldAddBookToLibrary() throws Exception {
        int expected = 1;
        libraryTest.addBook(bookTest);
        int actual = libraryTest.getSize();
        String description = "Test for adding book has ";
        assertEqualsInteger(expected, actual, description);
    }

    void shouldRemoveBookFromLibrary() throws Exception {
        int expected = 0;
        libraryTest.removeBook(bookTest);
        int actual = libraryTest.getSize();
        String description = "Test for removing book has ";
        assertEqualsInteger(expected, actual, description);
    }

    void assertEqualsInteger (int expected, int actual, String description) throws Exception {
        if (expected == actual) {
            System.out.println(description + "passed");
        } else {
            throw new Exception(description + "FAILED");
        }

    }
}
