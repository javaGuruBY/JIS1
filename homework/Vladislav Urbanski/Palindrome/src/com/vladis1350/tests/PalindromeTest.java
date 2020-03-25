package com.vladis1350.tests;

import com.vladis1350.Palindrome;

public class PalindromeTest {

    public void testShouldReturnTrueIfLinePalindrome() throws Exception {
        boolean expectedTrue = true;
        boolean actualOne = Palindrome.isPalindrome("asddsa");
        boolean actualTwo = Palindrome.isPalindrome("a,s.d:d;s';a");
        assertEqualBoolean(expectedTrue, actualOne, "testShouldReturnTrueIfLinePalindrome 'asddsa'");
        assertEqualBoolean(expectedTrue, actualTwo, "testShouldReturnTrueIfLinePalindrome 'a,s.d:d;s';a'");
    }

    private void assertEqualBoolean(boolean expected, boolean actual, String description) throws Exception {
        if (expected != actual) {
            throw new Exception(description + " has failed! \n" +
                    "Expected " + expected + " but was " + actual);
        } else {
            System.out.println(description + " has passed!");
        }
    }

}
