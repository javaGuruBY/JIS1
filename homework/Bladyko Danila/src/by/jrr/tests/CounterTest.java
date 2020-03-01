package by.jrr.tests;

import by.jrr.counter.Counter;

public class CounterTest {
    Counter counter;

    protected void testShouldWriteThreeAndFive() throws Exception {
        counter = new Counter(3,5);

        int actualValueResult = counter.getValue();
        int actualStepResult = counter.getStep();

        int expectedValueResult = 3;
        int expectedStepResult = 5;

        int notExpectedValueResult = 4;
        int notExpectedStepResult = 5;

        assertEqualNeedNumbers(actualValueResult, actualStepResult, expectedStepResult, expectedValueResult, "Test1");
        assertNotEqualNeedNumbers(actualValueResult, actualStepResult, notExpectedStepResult, notExpectedValueResult, "Test1");
    }

    protected void testShouldWriteFourAndThree() throws Exception {
        counter = new Counter(4,3);

        int actualValueResult = counter.getValue();
        int actualStepResult = counter.getStep();

        counter.increment();
        counter.setStep(8);
        counter.decrement();
        counter.increment();
        counter.reset();

        actualValueResult = counter.getValue();

        int expectedValueResult = 4;
        int expectedStepResult = 3;

        int notExpectedValueResult = 14;
        int notExpectedStepResult = 12;

        assertEqualNeedNumbers(actualValueResult, actualStepResult, expectedStepResult, expectedValueResult, "Test2");
        assertNotEqualNeedNumbers(actualValueResult, actualStepResult, notExpectedStepResult, notExpectedValueResult, "Test2");
    }

    private void assertEqualNeedNumbers(int actualValueResult, int actualStepResult, int expectedStepResult, int expectedValueResult,  String testName) throws Exception {
        if (actualValueResult == expectedValueResult && actualStepResult == expectedStepResult) {
            System.out.println(testName + " has passed!");
        } else {
            throw new Exception("\n" + testName + " is failed!\n" + "Expected \"" + expectedValueResult + "\" and \"" + expectedStepResult + "\" but was \"" + actualValueResult + "\" and \"" + expectedStepResult + "\"");
        }
    }

    private void assertNotEqualNeedNumbers(int actualValueResult, int actualStepResult, int notExpectedStepResult, int notExpectedValueResult,  String testName) throws Exception {
        if (actualValueResult != notExpectedValueResult || actualStepResult != notExpectedStepResult) {
            System.out.println(testName + " has passed!");
        } else {
            throw new Exception("\n" + testName + " is failed!\n" + "Expected \"" + notExpectedValueResult + "\" and \"" + notExpectedStepResult + "\" but was \"" + actualValueResult + "\" and \"" + actualStepResult + "\"");
        }
    }


}
