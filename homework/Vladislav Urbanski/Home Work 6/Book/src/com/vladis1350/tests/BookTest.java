package com.vladis1350.tests;

import com.vladis1350.bean.Book;

public class BookTest {

    public void getShouldReturnDataAuthor() throws Exception {
        Book book = new Book("Иван Сергеевич Тургенев", "Отцы и дети", 350);

        String expectedDataAuthor = "Иван Сергеевич Тургенев";
        String actualDataAuthor = book.getAuthor();
        assertEqualString(expectedDataAuthor, actualDataAuthor, "getShouldReturnDataAuthor");
    }

    public void getShouldReturnNameBook() throws Exception {
        Book book = new Book("Иван Сергеевич Тургенев", "Отцы и дети", 350);

        String expectedNameBook = "Отцы и дети";
        String actualNameBook = book.getName();
        assertEqualString(expectedNameBook, actualNameBook, "getShouldReturnNameBook");
    }

    public void getShouldReturnNumberPagesBook() throws Exception {
        Book book = new Book("Иван Сергеевич Тургенев", "Отцы и дети", 350);

        int expectedNumberPages = 350;
        int actualNumberPages = book.getNumberPage();
        assertEqualInteger(expectedNumberPages, actualNumberPages, "getShouldReturnNumberPagesBook");
    }

    public void setShouldEditOrSetDataAuthor() throws Exception {
        Book smallBook = new Book();
        Book bigBook = new Book("Александр Сергеевич Пушкин", "Сказка о царе Салтане", 150);

        String expectedAuthorSmallBook = "Маяковский Владимир Владимирович";
        String expectedAuthorBigBook = "Пушкин Александр Сергеевич";

        smallBook.setAuthor("Маяковский Владимир Владимирович");
        bigBook.setAuthor("Пушкин Александр Сергеевич");

        String actualAuthorSmallBook = smallBook.getAuthor();
        String actualAuthorBigBook = bigBook.getAuthor();

        assertEqualString(expectedAuthorSmallBook, actualAuthorSmallBook, "Test change data author of a small book");
        assertEqualString(expectedAuthorBigBook, actualAuthorBigBook, "Test change data author of a big book");
    }

    public void setShouldEditOrSetNameBook() throws Exception {
        Book bigBook = new Book();
        Book poems = new Book("Александр Сергеевич Пушкин", "Сказка о царе Салтане", 150);

        String expectedNameBigBook = "Война и мир";
        String expectedNamePoems = "Я помню чудное мгновенье";

        bigBook.setName("Война и мир");
        poems.setName("Я помню чудное мгновенье");

        String actualNameBigBook = bigBook.getName();
        String actualNamePoems = poems.getName();

        assertEqualString(expectedNameBigBook, actualNameBigBook, "Set the name of the big book");
        assertEqualString(expectedNamePoems, actualNamePoems, "Change book name");
    }

    private void assertEqualString(String expected, String actual, String descriptor) throws Exception {
        if (!expected.equals(actual)) {
            throw new Exception(descriptor + " has failed!\n" +
                    "Expected " + expected + " but was " + actual);
        } else {
            System.out.println(descriptor + " has passed!");
        }
    }

    private void assertEqualInteger(int expected, int actual, String descriptor) throws Exception {
        if (expected != actual) {
            throw new Exception(descriptor + " has failed!\n" +
                    "Expected " + expected + " but was " + actual);
        } else {
            System.out.println(descriptor + " has passed!");
        }
    }
}
