package com.company.test;

import com.company.bean.TV;
import com.company.service.TvService;

public class TVTest {
     TV tv = new TV();
     TvService tvService = new TvService();

    public void testShouldWorkWhenIncreaseChannelIsTrue() throws Exception {
        int expectedResult = tv.getCurrentChanel() +1;
        int actualResult = tvService.currentChanelIncrease();

        assertEqualsInteger(expectedResult, actualResult, "testShouldWorkWhenIncreaseChannelIsTrue");
    }
    public void testShouldWorkWhenReduceChannelIsTrue() throws Exception {
        int expectedResult = tv.getCurrentChanel()-1;
        int actualResult = tvService.currentChanelReduce();

        assertEqualsInteger(expectedResult, actualResult, "testShouldWorkWhenReduceChannelIsTrue");
    }

    public void testShouldWorkWhenIncreaseVolumeIsTrue() throws Exception {
        int expectedResult = tv.getCurrentVolume() +1;
        int actualResult = tvService.currentVolumeIncrease();

        assertEqualsInteger(expectedResult, actualResult, "testShouldWorkWhenIncreaseVolumeIsTrue");
    }
    public void testShouldWorkWhenReduceVolumeIsTrue() throws Exception {
        int expectedResult = tv.getCurrentVolume()-1;
        int actualResult = tvService.currentVolumeReduce();

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
}
