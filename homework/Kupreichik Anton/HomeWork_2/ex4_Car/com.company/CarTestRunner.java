package com.company;
import com.company.test.CarTest;

public class CarTestRunner {
    public static void main(String[] args) throws Exception {
        CarTest carTest = new CarTest();
        carTest.testShouldWorkWhenAccelerate();
        carTest.testShouldWorkWhenCarIsCanAccelerate();
        carTest.testShouldWorkWhenCarIsDriving();
        carTest.testShouldWorkWhenCarIsStopped();
        carTest.testShouldWorkWhenDecelerate();
    }
}


