package by.jrr.test;

import by.jrr.book.Book;

public class BookTest {
    Book book;

    protected void testShouldWriteTrue() throws Exception {
        book = new Book("Max", "JavaGuru", 120);

        String actualAuthorResult = book.getAuthor();
        String actualTitleResult = book.getTitle();
        int actualNumberOfPagesResult = book.getNumberOfPages();

        String expectedAuthorResult = "Max";
        String expectedTitleResult = "JavaGuru";
        int expectedNumberOfPagesResult = 120;


        String notExpectedAuthorResult = "Max1";
        String notExpectedTitleResult = "JavaG2uru";
        int notExpectedNumberOfPagesResult = 1320;

        assertEqualBoolean(actualAuthorResult, actualTitleResult, actualNumberOfPagesResult, expectedAuthorResult, expectedTitleResult, expectedNumberOfPagesResult, "Test1");
        assertNotEqualBoolean(actualAuthorResult, actualTitleResult, actualNumberOfPagesResult, notExpectedAuthorResult, notExpectedTitleResult, notExpectedNumberOfPagesResult, "Test1");
    }

    private void assertEqualBoolean(String actualAuthorResult, String actualTitleResult, int actualNumberOfPagesResult, String expectedAuthorResult, String expectedVTitleResult, int expectedVNumberOfPagesResult,  String testName) throws Exception {
        if (actualAuthorResult.equals(expectedAuthorResult) && actualTitleResult.equals(expectedVTitleResult) && actualNumberOfPagesResult == expectedVNumberOfPagesResult) {
            System.out.println(testName + " has passed!");
        } else {
            throw new Exception("\n" + testName + " is failed!\n" + "Expected \"" + expectedAuthorResult + "\" and \"" + expectedVTitleResult + "\" and \"" + expectedVNumberOfPagesResult + "\" but was \"" + actualAuthorResult + "\" and \"" + actualTitleResult + "\" and \"" + actualNumberOfPagesResult);
        }
    }

    private void assertNotEqualBoolean(String actualAuthorResult, String actualTitleResult, int actualNumberOfPagesResult, String expectedAuthorResult, String expectedVTitleResult, int expectedVNumberOfPagesResult,  String testName) throws Exception {
        if (!actualAuthorResult.equals(expectedAuthorResult) || !actualTitleResult.equals(expectedVTitleResult) || actualNumberOfPagesResult != expectedVNumberOfPagesResult) {
            System.out.println(testName + " has passed!");
        } else {
            throw new Exception("\n" + testName + " is failed!\n" + "Expected \"" + expectedAuthorResult + "\" and \"" + expectedVTitleResult + "\" and \"" + expectedVNumberOfPagesResult + "\" but was \"" + actualAuthorResult + "\" and \"" + actualTitleResult + "\" and \"" + actualNumberOfPagesResult);
        }
    }
}

