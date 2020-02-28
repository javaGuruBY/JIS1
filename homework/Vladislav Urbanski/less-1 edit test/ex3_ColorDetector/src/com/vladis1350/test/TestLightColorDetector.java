package com.vladis1350.test;

import com.vladis1350.service.LightColorDetector;

public class TestLightColorDetector {

    LightColorDetector lightColorDetector = new LightColorDetector();

    public void testShouldGiveOutViolet() throws Exception {
        String actualResult = lightColorDetector.detect(380);
        assertEqualsString("Violet", actualResult, "testShouldGiveOutViolet");
    }

    public void testShouldGiveOutBlue() throws Exception {
        String actualResult = lightColorDetector.detect(494);
        assertEqualsString("Blue", actualResult, "testShouldGiveOutBlue");
    }

    public void testShouldGiveOutGreen() throws Exception {
        String actualResult = lightColorDetector.detect(505);
        assertEqualsString("Green", actualResult, "testShouldGiveOutGreen");
    }

    public void testShouldGiveOutYellow() throws Exception {
        String actualResult = lightColorDetector.detect(581);
        assertEqualsString("Yellow", actualResult, "testShouldGiveOutYellow");
    }

    public void testShouldGiveOutOrange() throws Exception {
        String actualResult = lightColorDetector.detect(599);
        assertEqualsString("Orange", actualResult, "testShouldGiveOutOrange");
    }

    public void testShouldGiveOutRed() throws Exception {

        String actualResult = lightColorDetector.detect(749);
        assertEqualsString("Red", actualResult, "testShouldGiveOutRed");
    }

    public void testShouldGiveOutInvisibleLight() throws Exception {
        String actualResult = lightColorDetector.detect(215);
        assertEqualsString("Invisible Light", actualResult, "testShouldGiveOutInvisibleLight");
    }

    private void assertEqualsString(String expected, String actual, String description) throws Exception {
        if (!expected.equals(actual)) {
            throw new Exception(description + " has failed!" + "/n " +
                    "Expected " + expected + " but was " + actual);
        } else {
            System.out.println(description + " has passed!");
        }
    }
}
