package com.company;
import com.company.test.LibraryTest;

public class LibraryTestRunner {
    public static void main(String[] args) throws Exception{
        LibraryTest libraryTest = new LibraryTest();

        libraryTest.testShouldReturnNewCountOfBooks();
        libraryTest.testShouldReturnNewCountOfBooksAfterRemove();
    }
}
