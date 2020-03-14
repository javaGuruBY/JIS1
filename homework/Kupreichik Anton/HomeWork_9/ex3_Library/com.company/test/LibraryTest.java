package com.company.test;

import com.company.service.Book;
import com.company.service.Library;

public class LibraryTest {

    Library library = new Library();

    public void testShouldReturnNewCountOfBooks() throws Exception {
        String string = "Hello world!";
        library.addBook(new Book("автор1", "название1"));
        int  expectedResult = library.returnSize();
        int actualResult = 1;

        assertEqualsInteger(expectedResult, actualResult, "testShouldReturnNewCountOfBooks");
    }


    public void testShouldReturnNewCountOfBooksAfterRemove() throws Exception {
        String string = "Hello world!";
        library.addBook(new Book("автор1", "название1"));
        library.addBook(new Book("автор2", "название2"));
        library.removeBook("автор1", "название1");
        int  expectedResult = library.returnSize();
        int actualResult = 1;

        assertEqualsInteger(expectedResult, actualResult, "testShouldReturnNewCountOfBooksAfterRemove");
    }

    private void assertEqualsInteger(int expected, int actual, String description) throws Exception {
        if (expected != actual) {
            throw new Exception(description + " has failed! \n"+
                    "Expected '" + expected + "' but was '" + actual + "'");
        } else {
            System.out.println(description + " has passed!");
        }
    }
}
