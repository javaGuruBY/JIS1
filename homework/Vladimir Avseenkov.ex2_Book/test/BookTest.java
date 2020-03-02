package test;

import bean.Book;

public class BookTest {
    int someInteger;

    public BookTest(int someInteger) throws Exception {
        checkSetterAndGetterForAuthor();
        checkSetterAndGetterForNumbersOfPage();
        checkSetterAndGetterForTitle();
    }

    Book testBook = new Book();

    public void assertEqualsString(String expected, String actual, String description) throws Exception {
        if (expected.equals(actual)) {
            System.out.println("Test for " + description + " has passed");
        } else {
            throw new Exception(description + " FAILED");
        }
    }

    public void assertEqualsInteger(int expected, int actual, String description) throws Exception {
        if (expected == actual) {
            System.out.println("Test for " + description + " has passed");
        } else {
            throw new Exception(description + " FAILED");
        }
    }


    public void checkSetterAndGetterForAuthor() throws Exception {
        String expected = "test_test_test";
        testBook.setAuthor(expected);
        String actual = testBook.getAuthor();
        String description = "setter and getter for author";

        assertEqualsString(expected, actual, description);
    }


    public void checkSetterAndGetterForTitle() throws Exception {
        String expected = "title_title";
        testBook.setTitle(expected);
        String actual = testBook.getTitle();
        String description = "setter and getter for title";

        assertEqualsString(expected, actual, description);
    }

    public void checkSetterAndGetterForNumbersOfPage() throws Exception {
        int expected = 1234;
        testBook.setNumberOfPages(expected);
        int actual = testBook.getNumberOfPages();
        String description = "setter and getter for author";

        assertEqualsInteger(expected, actual, description);
    }

}
