package by.jrr.tests;

import by.jrr.bean.TV;
import by.jrr.bean.TVController;

public class TVControllerTest {
    TVController tvController;

    public void testShouldWriteSecondAndOne() throws Exception {
        tvController = new TVController();

        tvController.tv.onTV();
        tvController.tv.increaseChannel();
        tvController.tv.increaseChannel();
        tvController.tv.reduceChannel();

        int actualChannelResult = tvController.tv.getCurrentChannel();
        int actualVolumeResult = tvController.tv.getCurrentVolume();

        int expectedChannelResult = 2;
        int expectedVolumeResult = 1;

        int notExpectedChannelResult = 25;
        int notExpectedVolumeResult = 117;

        assertEqualInt(actualChannelResult, actualVolumeResult, expectedChannelResult, expectedVolumeResult, "Test1");
        assertNotEqualInt(actualChannelResult, actualVolumeResult, notExpectedChannelResult, notExpectedVolumeResult, "Test1");
    }

    private void assertEqualInt(int actualChannelResult, int actualVolumeResult, int expectedChannelResult, int expectedVolumeResult, String testName) throws Exception {
        if (actualChannelResult == expectedChannelResult && actualVolumeResult == expectedVolumeResult) {
            System.out.println(testName + " has passed!");
        } else {
            throw new Exception("\n" + testName + " is failed!\n" + "Expected " + expectedChannelResult + " and " + expectedVolumeResult + "  but was " + actualChannelResult + " " + actualVolumeResult);
        }
    }

    private void assertNotEqualInt(int actualChannelResult, int actualVolumeResult, int notExpectedChannelResult, int notExpectedVolumeResult, String testName) throws Exception {
        if (actualChannelResult != notExpectedChannelResult || actualVolumeResult != notExpectedChannelResult) {
            System.out.println(testName + " has passed!");
        } else {
            throw new Exception("\n" + testName + " is failed!\n" + "Expected " + notExpectedChannelResult + " and " + notExpectedVolumeResult + "  but was " + actualChannelResult + " " + actualVolumeResult);
        }
    }
}
