package by.jrr.tests;

import by.jrr.tv.TV;

public class TVTest {
    TV tv;

    public void testShouldWriteSecondAndOne() throws Exception {
        tv = new TV(1, 1, "JavaGuru", false);

        tv.onTV();
        tv.increaseChannel();
        tv.increaseChannel();
        tv.reduceChannel();

        int actualChannelResult = tv.getCurrentChannel();
        int actualVolumeResult = tv.getCurrentVolume();

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
            throw new Exception("\n" + testName + " is failed!\n" + "Expected  but was");
        }
    }

    private void assertNotEqualInt(int actualChannelResult, int actualVolumeResult, int notExpectedChannelResult, int notExpectedVolumeResult, String testName) throws Exception {
        if (actualChannelResult != notExpectedChannelResult || actualVolumeResult != notExpectedChannelResult) {
            System.out.println(testName + " has passed!");
        } else {
            throw new Exception("\n" + testName + " is failed!\n" + "Expected  but was");
        }
    }
}

