package com.vladis1350.tests;

import com.vladis1350.bean.Tv;
import com.vladis1350.service.TvController;

public class TvControllerTest {

    public void testTurnOffTVAndOnTv() throws Exception {
        Tv tv = new Tv(11, 21, "HP", false);
        TvController tvController = new TvController(tv);

        boolean expectedTrue = true;
        boolean expectedFalse = false;
        tvController.turnOnTV();
        boolean actualTrue = tvController.isWorking();
        tvController.turnOffTV();
        boolean actualFalse = tvController.isWorking();

        assertEqualBoolean(expectedTrue, actualTrue, "testTurnOffTVAndOnTv if TV is ON");
        assertEqualBoolean(expectedFalse, actualFalse, "testTurnOffTVAndOnTv if TV is Off");
    }

    public void nextChannelShouldIncreaseCurrentChannelOnOne() throws Exception {
        Tv tv = new Tv(20, 30, "Sumsung", true);
        TvController tvController = new TvController(tv);

        int expectedIfEnabled = 21;
        int expectedIfOff = 22;

        tvController.nextChanel();
        int actualIfEnabled = tvController.getCurrentChannel();
        tvController.nextChanel();

        tvController.turnOffTV();
        tvController.nextChanel();
        int actualIfOff= tvController.getCurrentChannel();

        assertEqualInteger(expectedIfEnabled, actualIfEnabled, "nextChannelShouldIncreaseCurrentChannelOnOne TV is On");
        assertEqualInteger(expectedIfOff, actualIfOff, "nextChannelShouldIncreaseCurrentChannelOnOne TV is Off");
    }

    public void decreaseVoiceShouldDecreaseCurrentVoice() throws Exception {
        Tv  tvHp = new Tv(17, 35, "HP", false);
        TvController tvController = new TvController(tvHp);

        int expectedIfOffTv = 35;
        int expectedIfOnTv = 34;

        tvController.decreaseCurrentVoice();
        tvController.decreaseCurrentVoice();
        int actualIfOffTv = tvController.getCurrentVoice();

        tvController.turnOnTV();
        tvController.decreaseCurrentVoice();
        int actualIfOnTv = tvController.getCurrentVoice();


        assertEqualInteger(expectedIfOnTv, actualIfOnTv, "decreaseVoiceShouldDecreaseCurrentVoice TV is On");
        assertEqualInteger(expectedIfOffTv, actualIfOffTv, "decreaseVoiceShouldDecreaseCurrentVoice TV is Off");
    }

    private void assertEqualInteger(int expected, int actual, String description) throws Exception {
        if (expected != actual) {
            throw new Exception(description + " has failed! \n" +
                    "Expected " + expected + " but was " + actual);
        } else {
            System.out.println(description + " has passed!");
        }
    }

    private void assertEqualBoolean(boolean expected, boolean actual, String description) throws Exception {
        if (expected != actual) {
            throw new Exception(description + " has failed! \n" +
                    "Expected " + expected + " but was " + actual);
        } else {
            System.out.println(description + " has passed!");
        }
    }
}
