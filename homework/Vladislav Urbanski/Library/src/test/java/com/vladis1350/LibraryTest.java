package com.vladis1350;

import com.vladis1350.bean.Book;
import com.vladis1350.services.Library;

public class LibraryTest {

    Library library = new Library();
    Book bookOne = new Book();
    Book bookTwo = new Book("Captain's daughter", "author");

    public void addBookShouldAddedBookInTheListBook() throws Exception {
        Book book = new Book();

        int expectedBeforeAdding = 0;
        int expectedAfterAdding = 1;

        int actualBefore = library.getListBook().size();

        library.addBook(book);
        int actualAfter = library.getListBook().size();

        assertEqualInteger(expectedBeforeAdding, actualBefore, "addBookShouldAddedBookInTheListBook before adding");
        assertEqualInteger(expectedAfterAdding, actualAfter, "addBookShouldAddedBookInTheListBook after adding");
    }

    public void removeBookShouldAddedDeleteFromBookList() throws Exception {

        int expectedBeforeRemove = 1;
        int expectedAfterRemove = 0;
        int actualBefore = library.getListBook().size();
        library.removeBook(bookOne);

        int actualAfter = library.getListBook().size();

        assertEqualInteger(expectedBeforeRemove, actualBefore, "removeBookShouldAddedDeleteFromBookList before adding");
        assertEqualInteger(expectedAfterRemove, actualAfter, "removeBookShouldAddedDeleteFromBookList after adding");
    }

    public void findByNameShouldFindABookByName() throws Exception {

        Book expectedBook = bookTwo;
        
        library.addBook(bookTwo);
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
