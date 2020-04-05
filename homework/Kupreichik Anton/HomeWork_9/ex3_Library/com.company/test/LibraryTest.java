package com.company.test;


import com.company.bean.Book;
import com.company.service.LibaryService;

public class LibraryTest {


    LibaryService library = new LibaryService();

    Book book1 = new  Book("автор1", "название1");
    Book book2 = new Book("автор2", "название2");

    public void testShouldReturnNewCountOfBooks() throws Exception {
        library.addBookToLibrary(book2);
        int expectedResult = library.getSize();
        int actualResult = 2;

        assertEqualsInteger(expectedResult, actualResult, "testShouldReturnNewCountOfBooks");
    }


    public void testShouldReturnNewCountOfBooksAfterRemove() throws Exception {
        library.addBookToLibrary(book2);
        library.addBookToLibrary(book1);
        library.deleteBookFromLibrary(book1);
        int expectedResult = library.getSize();
        int actualResult = 1;

        assertEqualsInteger(expectedResult, actualResult, "testShouldReturnNewCountOfBooksAfterRemove");
    }

    private void assertEqualsInteger(int expected, int actual, String description) throws Exception {
        if (expected != actual) {
            throw new Exception(description + " has failed! \n" +
                    "Expected '" + expected + "' but was '" + actual + "'");
        } else {
            System.out.println(description + " has passed!");
        }
    }
}
