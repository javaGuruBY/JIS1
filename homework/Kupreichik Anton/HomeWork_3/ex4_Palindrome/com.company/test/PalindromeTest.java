package com.company.test;
import com.company.service.PalindromeService;

public class PalindromeTest {

    PalindromeService palindromeService = new PalindromeService();

    public void testShouldReturnTrueOfFalse() throws Exception {
        String string = "Madam, I'm Adam!";
        boolean expectedResult = palindromeService.isPalindrome(string);
        boolean actualResult = true;

        assertEqualsBoolean(expectedResult, true, "testShouldReturnTrueOfFalse");
    }


    private void assertEqualsBoolean(boolean expected, boolean actual, String description) throws Exception {
        if (expected != actual) {
            throw new Exception(description + " has failed! \n"+
                    "Expected '" + expected + "' but was '" + actual + "'");
        } else {
            System.out.println(description + " has passed!");
        }
    }
}
