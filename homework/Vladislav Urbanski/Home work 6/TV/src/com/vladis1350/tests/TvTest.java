package com.vladis1350.tests;

import com.vladis1350.bean.Tv;

public class TvTest {

    public void nextChannelShouldIncreaseCurrentChannelOnOne() throws Exception {
        Tv tvSamsung = new Tv(15, 32, "Samsung", true);
        Tv tvHp = new Tv(15, 32, "HP", false);

        int expectedTvSamsung = 16;
        int expectedTvHp = 15;

        tvSamsung.nextChanel();
        tvHp.nextChanel();

        int actualTvSamsung = tvSamsung.getCurrentChannel();
        int actualTvHp = tvHp.getCurrentChannel();

        assertEqualInteger(expectedTvSamsung, actualTvSamsung, "nextChannelShouldIncreaseCurrentChannelOnOne TV is On");
        assertEqualInteger(expectedTvHp, actualTvHp, "nextChannelShouldIncreaseCurrentChannelOnOne TV is Off");
    }

    public void nextChannelShouldDecreaseCurrentChannelOnOne() throws Exception {
        Tv tvSamsung = new Tv(17, 32, "Samsung", true);
        Tv tvHp = new Tv(17, 32, "HP", false);

        int expectedTvSamsung = 16;
        int expectedTvHp = 17;

        tvSamsung.previousChanel();
        tvHp.previousChanel();

        int actualTvSamsung = tvSamsung.getCurrentChannel();
        int actualTvHp = tvHp.getCurrentChannel();

        assertEqualInteger(expectedTvSamsung, actualTvSamsung, "nextChannelShouldDecreaseCurrentChannelOnOne TV is On");
        assertEqualInteger(expectedTvHp, actualTvHp, "nextChannelShouldDecreaseCurrentChannelOnOne TV is Off");
    }

    public void increaseVoiceShouldIncreaseCurrentVoice() throws Exception {
        Tv tvSumsung = new Tv(17, 32, "Samsung", true);
        Tv  tvHp = new Tv(17, 32, "HP", false);

        int expectedTvSamsung = 33;
        int expectedTvHp = 32;

        tvSumsung.increaseCurrentVoice();
        tvHp.increaseCurrentVoice();

        int actualTvSamsung = tvSumsung.getCurrentVoice();
        int actualTvHp = tvHp.getCurrentVoice();

        assertEqualInteger(expectedTvSamsung, actualTvSamsung, "increaseVoiceShouldIncreaseCurrentVoice TV is on");
        assertEqualInteger(expectedTvHp, actualTvHp, "increaseVoiceShouldIncreaseCurrentVoice TV is off");
    }

    public void decreaseVoiceShouldDecreaseCurrentVoice() throws Exception {
        Tv tvSumsung = new Tv(17, 32, "Samsung", true);
        Tv  tvHp = new Tv(17, 32, "HP", false);

        int expectedTvSamsung = 31;
        int expectedTvHp = 32;

        tvSumsung.decreaseCurrentVoice();
        tvHp.decreaseCurrentVoice();

        int actualTvSamsung = tvSumsung.getCurrentVoice();
        int actualTvHp = tvHp.getCurrentVoice();

        assertEqualInteger(expectedTvSamsung, actualTvSamsung, "decreaseVoiceShouldDecreaseCurrentVoice TV is On");
        assertEqualInteger(expectedTvHp, actualTvHp, "decreaseVoiceShouldDecreaseCurrentVoice TV is Off");
    }

    public void turnOnTvShouldReturnTrue() throws Exception {
        Tv tv = new Tv(17, 32, "Samsung", false);

        boolean expected = true;
        tv.turnOnTV();
        boolean actual = tv.isWorking();
        assertEqualBoolean(expected, actual, "turnOnTvShouldReturnTrue");
    }

    public void turnOffTvShouldReturnFalse() throws Exception {
        Tv tv = new Tv(17, 32, "Samsung", true);

        boolean expected = false;
        tv.turnOffTV();
        boolean actual = tv.isWorking();
        assertEqualBoolean(expected, actual, "turnOffTvShouldReturnFalse");
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
