package com.vladis1350;

public class LibraryApplicationTest {
    public static void main(String[] args) throws Exception {
        LibraryTest libraryTest = new LibraryTest();
        libraryTest.addBookShouldAddedBookInTheListBook();
        libraryTest.removeBookShouldAddedDeleteFromBookList();
        libraryTest.findByNameShouldFindABookByName();
    }
}
