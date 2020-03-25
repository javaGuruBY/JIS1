package com.vladis1350;

import com.vladis1350.tests.CarTest;

public class CarRunTest {
    public static void main(String[] args) throws Exception {
        CarTest carTest = new CarTest();
        carTest.accelerateShouldIncreaseCurrentSpeed();
        carTest.decelerateShouldDecreaseCurrentSpeed();
        carTest.isDrivingShouldReturnTrueIfCurrentSpeedMoreZero();
    }
}
