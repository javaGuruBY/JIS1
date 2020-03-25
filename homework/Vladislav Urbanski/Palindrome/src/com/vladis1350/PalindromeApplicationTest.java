package com.vladis1350;

import com.vladis1350.tests.PalindromeTest;

public class PalindromeApplicationTest {
    public static void main(String[] args) throws Exception {
        Palindrome palindrome = new Palindrome();
        PalindromeTest palindromeTest = new PalindromeTest();

        String text = "asdsa";
        String text2 = "a,s:d;s';a";
        String text3 = "a-s+d*b/a";

        System.out.println(palindrome.isPalindrome(text));
        System.out.println(palindrome.isPalindrome(text2));
        System.out.println(palindrome.isPalindrome(text3));

        palindromeTest.testShouldReturnTrueIfLinePalindrome();
    }

}
