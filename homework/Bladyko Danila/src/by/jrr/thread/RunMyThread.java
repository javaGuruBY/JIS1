package by.jrr.thread;

import by.jrr.test.CopyTest;

public class RunMyThread implements Runnable{
    public void run() {
        CopyTest copyTest = new CopyTest();

        copyTest.testShouldCopyArray();
    }
}
