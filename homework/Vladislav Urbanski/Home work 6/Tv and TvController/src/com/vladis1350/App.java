package com.vladis1350;

import com.vladis1350.tests.TvControllerTest;

public class App {
    public static void main(String[] args) throws Exception {
        TvControllerTest tvControllerTest = new TvControllerTest();

//        tvControllerTest.testTurnOffTVAndOnTv();
//        tvControllerTest.nextChannelShouldIncreaseCurrentChannelOnOne();
        tvControllerTest.decreaseVoiceShouldDecreaseCurrentVoice();
    }
}
