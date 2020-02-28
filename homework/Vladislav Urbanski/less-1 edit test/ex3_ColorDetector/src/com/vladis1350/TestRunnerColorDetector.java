package com.vladis1350;

import com.vladis1350.test.TestLightColorDetector;

public class TestRunnerColorDetector {

    public static void main(String[] args) throws Exception {
        TestLightColorDetector testLightColorDetector = new TestLightColorDetector();
        testLightColorDetector.testShouldGiveOutBlue();
        testLightColorDetector.testShouldGiveOutGreen();
        testLightColorDetector.testShouldGiveOutOrange();
        testLightColorDetector.testShouldGiveOutRed();
        testLightColorDetector.testShouldGiveOutViolet();
        testLightColorDetector.testShouldGiveOutYellow();
        testLightColorDetector.testShouldGiveOutInvisibleLight();
    }
}
