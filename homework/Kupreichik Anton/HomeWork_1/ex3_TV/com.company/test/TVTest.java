package com.company.test;

import com.company.service.TV;

public class TVTest {
     TV tv = new TV();

    public void testShouldWorkWhenIncreaseChannelIsTrue() throws Exception {
        int expectedResult = tv.getCurrentChanel() +1;
        int actualResult = tv.currentChanelIncrease();

        assertEqualsInteger(expectedResult, actualResult, "testShouldWorkWhenIncreaseChannelIsTrue");
    }
    public void testShouldWorkWhenReduceChannelIsTrue() throws Exception {
        int expectedResult = tv.getCurrentChanel()-1;
        int actualResult = tv.currentChanelReduce();

        assertEqualsInteger(expectedResult, actualResult, "testShouldWorkWhenReduceChannelIsTrue");
    }

    public void testShouldWorkWhenIncreaseVolumeIsTrue() throws Exception {
        int expectedResult = tv.getCurrentVolume() +1;
        int actualResult = tv.currentVolumeIncrease();

        assertEqualsInteger(expectedResult, actualResult, "testShouldWorkWhenIncreaseVolumeIsTrue");
    }
    public void testShouldWorkWhenReduceVolumeIsTrue() throws Exception {
        int expectedResult = tv.getCurrentVolume()-1;
        int actualResult = tv.currentVolumeReduce();

        assertEqualsInteger(expectedResult, actualResult, "testShouldWorkWhenReduceVolumeIsTrue");
    }



    private void assertEqualsInteger(int expected, int actual, String description) throws Exception {
        if (expected != actual) {
            throw new Exception(description + " has failed! \n"+
                    "Expected '" + expected + "' but was '" + actual + "'");
        } else {
            System.out.println(description + " has passed!");
        }
    }

    private void assertEqualsString(String expected, String actual, String description) throws Exception {
        if (!expected.equals(actual)) {
            throw new Exception(description + " has failed! \n"+
                    "Expected '" + expected + "' but was '" + actual + "'");
        } else {
            System.out.println(description + " has passed!");
        }
    }

}
