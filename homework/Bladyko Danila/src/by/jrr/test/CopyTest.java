package by.jrr.test;

import by.jrr.bean.LookupArrayService;

public class CopyTest {
    LookupArrayService lookupArrayService;

    public void testShouldReturnMaxNumber() throws Exception {
        lookupArrayService = new LookupArrayService();

        int[] array = {1, 2, 3, -5, -6, -7, 12, 0};

        int actualResult = lookupArrayService.findMax(array);

        int expectedResult = 12;
        int notExpectedResult = -7;

        checkGoodAnswer(actualResult, expectedResult, "Test 1");
        checkBadAnswer(actualResult, notExpectedResult, "Test 1");
    }

    public void testShouldReturnMinNumber() throws Exception {
        lookupArrayService = new LookupArrayService();

        int[] array = {1, 2, 3, -5, -6, -7, 12, 0};

        int actualResult = lookupArrayService.findMin(array);

        int expectedResult = -7;
        int notExpectedResult = 0;

        checkGoodAnswer(actualResult, expectedResult, "Test 2");
        checkBadAnswer(actualResult, notExpectedResult, "Test 2");
    }

    public void testShouldReturnIndexOfMax() throws Exception {
        lookupArrayService = new LookupArrayService();

        int[] array = {1, 2, 3, -5, -6, -7, 12, 0};

        int actualResult = lookupArrayService.indexOfMax(array);

        int expectedResult = 7;
        int notExpectedResult = 2;

        checkGoodAnswer(actualResult, expectedResult, "Test 3");
        checkBadAnswer(actualResult, notExpectedResult, "Test 3");
    }

    public void testShouldReturnIndexOfMin() throws Exception {
        lookupArrayService = new LookupArrayService();

        int[] array = {1, 2, 3, -5, -6, -7, 12, 0};

        int actualResult = lookupArrayService.indexOfMin(array);

        int expectedResult = 6;
        int notExpectedResult = 8;

        checkGoodAnswer(actualResult, expectedResult, "Test 4");
        checkBadAnswer(actualResult, notExpectedResult, "Test 4");
    }

    public void testShouldReturnIndexOf() throws Exception {
        lookupArrayService = new LookupArrayService();

        int[] array = {1, 2, 3, -5, -6, -6, 12, 0};

        int actualResult = lookupArrayService.indexOf(array, -6);

        int expectedResult = 5;
        int notExpectedResult = 6;

        checkGoodAnswer(actualResult, expectedResult, "Test 5");
        checkBadAnswer(actualResult, notExpectedResult, "Test 5");
    }

    private void checkGoodAnswer(int actualResult, int expectedResult, String test) throws Exception {
        if(actualResult == expectedResult) {
            System.out.println(test + " has passed!");
        }
        else {
            throw new Exception(test + " hasn't passed!\nExpected result = " + expectedResult + " but actual result = " + actualResult);
        }
    }

    private void checkBadAnswer(int actualResult, int notExpectedResult, String test) throws Exception {
        if(actualResult != notExpectedResult) {
            System.out.println(test + " has passed!");
        }
        else {
            throw new Exception(test + " hasn't passed!\nExpected result = " + notExpectedResult + " but actual result = " + actualResult);
        }
    }
}
