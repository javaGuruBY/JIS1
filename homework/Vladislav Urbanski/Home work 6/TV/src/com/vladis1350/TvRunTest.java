package com.vladis1350;

import com.vladis1350.tests.TvTest;

public class TvRunTest {
    public static void main(String[] args) throws Exception {
        TvTest tvTest = new TvTest();

        tvTest.nextChannelShouldIncreaseCurrentChannelOnOne();
        tvTest.nextChannelShouldDecreaseCurrentChannelOnOne();
        tvTest.increaseVoiceShouldIncreaseCurrentVoice();
        tvTest.decreaseVoiceShouldDecreaseCurrentVoice();
        tvTest.turnOnTvShouldReturnTrue();
        tvTest.turnOffTvShouldReturnFalse();
    }
}
