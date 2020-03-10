package test;

import service.Palindrome;

public class PalindromeTest {

    public void runTest () throws Exception {
        shouldReturnTrue();
        shouldReturnFalse();
    }

    void shouldReturnTrue() throws Exception {
        String text = "Qw/ErT!Re*wQ";
        boolean expected = true;
        boolean actual = Palindrome.isPalindrome(text);
        booleanEquals(expected, actual);
    }

    void shouldReturnFalse () throws Exception {
        String text = "qwe";
        boolean expected = false;
        boolean actual = Palindrome.isPalindrome(text);
        booleanEquals(expected, actual);
    }

    void booleanEquals (boolean expected, boolean actual) throws Exception {
        if (expected == actual) {
            System.out.println("Test passed");
        } else {
            throw new Exception("Test FAILED!");
        }
    }
}
