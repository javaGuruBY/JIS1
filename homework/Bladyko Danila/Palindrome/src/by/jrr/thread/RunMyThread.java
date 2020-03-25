package by.jrr.thread;

import by.jrr.test.PalindromeTest;

public class RunMyThread implements Runnable {
    public void run() {
        PalindromeTest palindromeTest = new PalindromeTest();

        try {
            palindromeTest.testShouldAnswerTrue();
            palindromeTest.testShouldAnswerFalse();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
