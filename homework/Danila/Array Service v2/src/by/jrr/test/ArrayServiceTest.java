package by.jrr.test;

import by.jrr.bean.ArrayService;

import java.util.Arrays;

public class ArrayServiceTest {
    ArrayService arrayService;

    public void testShouldCreateArray() throws Exception {
        arrayService = new ArrayService();

        int[] array = arrayService.create(15);

        int actualResult = 15;

        int expectedResult = 15;
        int notExpectedResult = 10;

        checkGoodAnswer(actualResult, expectedResult, "Test 1");
        checkBadAnswer(actualResult, notExpectedResult, "Test 1");
    }

    public void testShouldCountSum() throws Exception {
        arrayService = new ArrayService();

        int[] array = {1, 2, 3, 4};

        int actualResult = arrayService.sum(array);

        int expectedResult = 10;
        int notExpectedResult = 11;

        checkGoodAnswer(actualResult, expectedResult, "Test 2");
        checkBadAnswer(actualResult, notExpectedResult, "Test 2");
    }

    public void testShouldCountAvg() throws Exception {
        arrayService = new ArrayService();

        int[] array = {1, 2, 3, 4};

        double actualResult = arrayService.avg(array);

        double expectedResult = 2.5;
        double notExpectedResult = 2.0;

        checkGoodAnswerDouble(actualResult, expectedResult, "Test 3");
        checkBadAnswerDouble(actualResult, notExpectedResult, "Test 3");
    }

    public void testShouldSortArray() {
        arrayService = new ArrayService();

        int[] array = {10, -7, 5, 2};

        arrayService.sort(array);
        System.out.println(Arrays.toString(array));

        arrayService.swap(array);
        System.out.println(Arrays.toString(array));
    }


    private void checkGoodAnswer(int actualResult, int expectedResult, String test) throws Exception {
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
            throw new Exception(test + " hasn't passed!\nExpected result = " + expectedResult + " but actual result = " + actualResult);
        }
    }

    private void checkGoodAnswerDouble(double actualResult, double expectedResult, String test) throws Exception {
        if(actualResult == expectedResult) {
            System.out.println(test + " has passed!");
        }
        else {
            throw new Exception(test + " hasn't passed!\nExpected result = " + expectedResult + " but actual result = " + actualResult);
        }
    }

    private void checkBadAnswerDouble(double actualResult, double expectedResult, String test) throws Exception {
        if(actualResult != expectedResult) {
            System.out.println(test + " has passed!");
        }
        else {
            throw new Exception(test + " hasn't passed!\nExpected result = " + expectedResult + " but actual result = " + actualResult);
        }
    }
}
