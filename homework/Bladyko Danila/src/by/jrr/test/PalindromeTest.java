package by.jrr.test;

import by.jrr.bean.Palindrome;

public class PalindromeTest {
    Palindrome palindrome;

    public void testShouldAnswerTrue() throws Exception {
        palindrome = new Palindrome();

        boolean actualFirstResult = palindrome.isPalindrome("aassaa");
        boolean actualSecondResult = palindrome.isPalindrome("!!a!a?s,s.a/[a}");

        boolean expectedResult = true;

        checkGoodAnswer(actualFirstResult, expectedResult, "Test 1");
        checkGoodAnswer(actualSecondResult, expectedResult, "Test 2");
    }

    public void testShouldAnswerFalse() throws Exception {
        palindrome = new Palindrome();

        boolean actualResult = palindrome.isPalindrome("adaa");

        boolean expectedResult = false;

        checkGoodAnswer(actualResult, expectedResult, "Test 3");
    }

    private void checkGoodAnswer(boolean actualResult, boolean expectedResult, String test) throws Exception {
        if(actualResult == expectedResult) {
            System.out.println(test + " has passed!");
        }
        else {
            throw new Exception(test + " hasn't passed!\nExpected result = " + expectedResult + " but actual result = " + actualResult);
        }
    }
}
