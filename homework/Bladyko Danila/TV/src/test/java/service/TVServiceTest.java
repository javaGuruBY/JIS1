package service;

import bean.TV;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TVServiceTest {
    TV tv;
    TVService tvService;

    @Before
    public void setUp() throws Exception {
        tv = new TV();
        tvService = new TVService();
    }

    @Test
    public void testShouldCheckTheChannelIsIncreased() {
        tvService.switchToTheNextChannel(tv);
        tvService.switchToTheNextChannel(tv);

        int actualResult = tv.currentChannel;
        int expectedResult = 2;

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testShouldCheckTheChannelIsPrevious() {
        tv.currentChannel = 2;

        tvService.switchToPreviousChannel(tv);
        tvService.switchToPreviousChannel(tv);

        int actualResult = tv.currentChannel;
        int expectedResult = 0;

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testShouldCheckIncreaseVoice() {
        tvService.increaseVoice(tv);
        tvService.increaseVoice(tv);

        int actualResult = tv.currentVoice;
        int expectedResult = 2;

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testShouldCheckReduceVoice() {
        tv.currentVoice = 2;

        tvService.reduceVoice(tv);
        tvService.reduceVoice(tv);

        int actualResult = tv.currentVoice;
        int expectedResult = 0;

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testShouldCheckTurnOnTV() {
        tvService.turnOnTV(tv);

        boolean actualResult = tv.TVIsOn;

        Assert.assertTrue(actualResult);
    }

    @Test
    public void testShouldCheckTurnOffTV() {
        tvService.turnOnTV(tv);
        tvService.turnOffTV(tv);

        boolean actualResult = tv.TVIsOn;

        Assert.assertFalse(actualResult);
    }
}
