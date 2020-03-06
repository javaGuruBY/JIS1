package by.jrr.tests;

import by.jrr.service.NumberService;

public class TestNumberService {
    NumberService numberService;

    public void testShouldCheckWorkRangeSum() throws Exception {
        numberService = new NumberService();

        int firstActualResult = numberService.rangeSum(10, 20);
        int secondActualResult = numberService.rangeSum(5, 10);

        int expectedResult = 165;
        int notExpectedResult = 100;

        checkAnswer(firstActualResult, expectedResult, "Test 1");
        checkBadAnswer(secondActualResult, notExpectedResult, "Test 1");
    }

    public void testShouldCheckWorkRangeEventCount() throws Exception {
        numberService = new NumberService();

        int firstActualResult = numberService.rangeEventCount(10, 5);
        int secondActualResult = numberService.rangeEventCount(20, 20);

        int expectedResult = 3;
        int notExpectedResult = 2;

        checkAnswer(firstActualResult, expectedResult, "Test 2");
        checkBadAnswer(secondActualResult, notExpectedResult, "Test 2");
    }

    private void checkAnswer(int actualResult, int expectedResult, String test) throws Exception {
        if(actualResult == expectedResult) {
            System.out.println(test + " has passed!");
        }
        else {
            throw new Exception(test + " hasn't passed!\nExpected result = " + expectedResult + " but actual result = " + actualResult);
        }
    }

    private void checkBadAnswer(int actualResult, int expectedResult, String test) throws Exception {
        if(actualResult != expectedResult) {
            System.out.println(test + " has passed!");
        }
        else {
            throw new Exception(test + " hasn't passed!\nExpected result != " + expectedResult + " but actual result = " + actualResult);
        }
    }
}
