package com.company.test;
import com.company.service.ArrayService;

import java.util.Arrays;

public class ArrayServiceTest {
    ArrayService arrayService = new ArrayService();

    public void testShouldReturnSum() throws Exception {
        int[] array = {1, -9, 7, 50, -63, 18 , 54, -9, 104};
        int expectedResult = arrayService.sum(array);
        int actualResult = 153;

        assertEqualsInteger(expectedResult, actualResult, "testShouldReturnSum");
    }


    public void testShouldReturnSort() throws Exception {
        int[] array = {105, -9, 4, -5, 15};
        int[] expectedResult = arrayService.sort(array);
        int[] actualResult = {-9, -5, 4, 15, 105};
        assertEqualsArrays(expectedResult, actualResult, "testShouldReturnSort");
    }

    public void testShouldReturnSwap() throws Exception {
        int[] array = {105, -9, 4, -5, 15};
        int[] expectedResult = arrayService.swap(array);
        int[] actualResult = {15, -5, 4, -9, 105};
        assertEqualsArrays(expectedResult, actualResult, "testShouldReturnSwap");
    }

    public void testShouldReturnAvg() throws Exception {
        int[] array = {1, -9, 7, 50, -63, 18 , 54, -9, 104};
        double expectedResult = arrayService.avg(array);
        double actualResult = 17;

        assertEqualsDouble(expectedResult, actualResult, "testShouldReturnAvg");
    }

    private void assertEqualsInteger(int expected, int actual, String description) throws Exception {
        if (expected != actual) {
            throw new Exception(description + " has failed! \n"+
                    "Expected '" + expected + "' but was '" + actual + "'");
        } else {
            System.out.println(description + " has passed!");
        }
    }

    private void assertEqualsArrays(int[] expected, int[] actual, String description) throws Exception {
        if (!Arrays.equals(expected, actual)) {
            throw new Exception(description + " has failed! \n"+
                    "Expected '" + expected + "' but was '" + actual + "'");
        } else {
            System.out.println(description + " has passed!");
        }
    }

    private void assertEqualsDouble(double expected, double actual, String description) throws Exception {
        if (expected != actual) {
            throw new Exception(description + " has failed! \n"+
                    "Expected '" + expected + "' but was '" + actual + "'");
        } else {
            System.out.println(description + " has passed!");
        }
    }
}
