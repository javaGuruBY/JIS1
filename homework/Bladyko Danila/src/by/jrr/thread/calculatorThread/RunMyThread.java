package by.jrr.calculatorThread;

import by.jrr.tests.PowerCalculatorTest;

public class RunMyThread implements Runnable {
    public void run() {
        PowerCalculatorTest powerCalculatorTest = new PowerCalculatorTest();

        try {
            powerCalculatorTest.test();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
