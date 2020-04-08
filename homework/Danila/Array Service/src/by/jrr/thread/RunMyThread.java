package by.jrr.thread;

import by.jrr.test.CopyTest;

public class RunMyThread implements Runnable {
    public void run() {
        CopyTest copyTest = new CopyTest();
        try {
            copyTest.testShouldReturnMaxNumber();
            copyTest.testShouldReturnMinNumber();
            copyTest.testShouldReturnIndexOfMax();
            copyTest.testShouldReturnIndexOfMin();
            copyTest.testShouldReturnIndexOf();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
