package by.jrr.arrayThread;

import by.jrr.test.ArrayServiceTest;

public class RunMyThread implements Runnable {
    public void run() {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();

        try {
            arrayServiceTest.testShouldCountSum();
            arrayServiceTest.testShouldCountAvg();
            arrayServiceTest.testShouldCreateArray();
            arrayServiceTest.testShouldSortArray();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
