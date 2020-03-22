package by.jrr.loopThread;

import by.jrr.tests.CarTest;

public class RunMyThread implements Runnable{

    public void run() {
        CarTest carTest = new CarTest();

        try {
            carTest.testShouldWriteSpeedCar();
            carTest.testShouldWritDividing();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
