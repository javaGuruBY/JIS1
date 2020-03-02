package com.vladis1350;

import com.vladis1350.tests.BookTest;

public class BookRunTest {
    public static void main(String[] args) throws Exception {
        BookTest bookTest = new BookTest();

//        bookTest.getShouldReturnDataAuthor();
//        bookTest.getShouldReturnNameBook();
//        bookTest.getShouldReturnNumberPagesBook();

        bookTest.setShouldEditOrSetDataAuthor();
        bookTest.setShouldEditOrSetNameBook();
    }
}
