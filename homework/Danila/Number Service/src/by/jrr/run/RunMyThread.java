package by.jrr.run;

import by.jrr.tests.TestNumberService;

public class RunMyThread implements Runnable {
    @Override
    public void run() {
        TestNumberService testNumberService = new TestNumberService();

        try {
            testNumberService.testShouldCheckWorkRangeSum();
            testNumberService.testShouldCheckWorkRangeEventCount();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
