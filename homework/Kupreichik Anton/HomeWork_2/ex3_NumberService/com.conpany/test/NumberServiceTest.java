package com.company.test;
import com.company.service.NumberService;


public class NumberServiceTest {
    NumberService numberService = new NumberService();

    public void testShouldWorkWhenInRangeSumFinishLargerStart() throws Exception {
        int expectedResult = numberService.rangeSum(3,7);
        int actualResult = 25;

        assertEqualsInteger(expectedResult, actualResult, "testShouldWorkWhenInRangeSumFinishLargerStart");
    }

    public void testShouldWorkWhenInRangeSumStartLargerFinish() throws Exception {
        int expectedResult = numberService.rangeSum(7,3);
        int actualResult = 25;

        assertEqualsInteger(expectedResult, actualResult, "testShouldWorkWhenInRangeSumStartLargerFinish");
    }

    public void testShouldWorkWhenInRangeSumFinishEqualsStart() throws Exception {
        int expectedResult = numberService.rangeSum(7,7);
        int actualResult = 7;

        assertEqualsInteger(expectedResult, actualResult, "testShouldWorkWhenInRangeSumFinishEqualsStart");
    }

    public void testShouldWorkWhenInRangeEvenCountFinishEqualsStartAndThisNumberIsEven() throws Exception {
        int expectedResult = numberService.rangeEvenCount(10,10);
        int actualResult = 1;

        assertEqualsInteger(expectedResult, actualResult, "testShouldWorkWhenInRangeEvenCountFinishEqualsStartAndThisNumberIsEven");
    }

    public void testShouldWorkWhenInRangeEvenCountFinishEqualsStartAndThisNumbersIsntEven() throws Exception {
        int expectedResult = numberService.rangeEvenCount(7,7);
        int actualResult = 0;

        assertEqualsInteger(expectedResult, actualResult, "testShouldWorkWhenInRangeEvenCountFinishEqualsStartAndThisNumbersIsntEven");
    }

    public void testShouldWorkWhenInRangeEvenCountFinishLargerStart() throws Exception {
        int expectedResult = numberService.rangeEvenCount(2,10);
        int actualResult = 5;

        assertEqualsInteger(expectedResult, actualResult, "testShouldWorkWhenInRangeEvenCountFinishLargerStart");
    }

    public void testShouldWorkWhenInRangeEvenCountStartLargerFinish() throws Exception {
        int expectedResult = numberService.rangeEvenCount(10,2);
        int actualResult = 5;

        assertEqualsInteger(expectedResult, actualResult, "testShouldWorkWhenInRangeEvenCountStartLargerFinish");
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

