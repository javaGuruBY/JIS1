package test;

import service.ArrayService;

import java.util.Arrays;

public class ArrayServiceTest {
    ArrayService arrayService = new ArrayService();

    public void runTests() throws Exception {
        shouldReturnAverageResult();
        shouldReturnSum();
        shouldSortArray();
        sholdSwapArray();
    }

    void shouldReturnAverageResult() throws Exception {
        int[] array = {0, 5, 10, 15, 20};
        double expected = 10.0;
        double actual = arrayService.avg(array);
        String description = "Test for average from array has ";
        checkEqualsDouble(expected, actual, description);
    }

    private void checkEqualsDouble(double expected, double actual, String description) throws Exception {
        if (expected == actual) {
            System.out.println(description + "passed.");
        } else {
            throw new Exception(description + "FAILED!");
        }
    }

    void shouldReturnSum() throws Exception {
        int[] array = {1, 2, 3};
        int expected = 6;
        int actual = arrayService.sum(array);
        String description = "Test for sum from array is ";
        checkEqualsInteger(expected, actual, description);
    }

    private void checkEqualsInteger(int expected, int actual, String description) throws Exception {
        if (expected == actual) {
            System.out.println(description + "passed");
        } else {
            throw new Exception(description + "FAILED!");
        }
    }

    void shouldSortArray () throws Exception {
        int[] array = {1, 3, 5, 2, 4};
        int[] expected = {1, 2, 3, 4, 5};
        int[] actual = arrayService.sort(array);
        String description = "Test for array sorting has ";
        checkEqualsArray(expected, actual, description);
    }

    void sholdSwapArray () throws Exception {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        int[] actual = arrayService.swap(array);
        String description = "Test for array swapping has ";
        checkEqualsArray(expected, actual, description);
    }

    private void checkEqualsArray (int[] expected, int[] actual, String description) throws Exception {
        if (Arrays.equals(expected,actual)) {
            System.out.println(description + "passed");
        } else {
            throw new Exception(description + "FAILED!");
        }
    }
}
