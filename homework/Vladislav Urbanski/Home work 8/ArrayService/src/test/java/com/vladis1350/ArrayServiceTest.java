package com.vladis1350;

import com.vladis1350.service.ArrayService;

public class ArrayServiceTest {

    public void createShouldReturnEmptyArrayGiveSize() throws Exception {
        ArrayService arrayService = new ArrayService();
        int[] array;
        int expected = 10;
        array = arrayService.create(10);
        int actual = array.length;
        assertEqualInteger(expected, actual, "createShouldReturnEmptyArrayGiveSize");
    }

    public void sumShouldReturnSumElementsArray() throws Exception {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 5, 9, 1, 4};
        int expected = 20;
        int actual = arrayService.sum(array);
        assertEqualInteger(expected, actual, "sumShouldReturnSumElementsArray");
    }

    public void avgShouldReturnAVGElementsArray() throws Exception {
        ArrayService arrayService = new ArrayService();
        int[] array = {1, 5, 9, 1, 4};
        double expected = 4;
        double actual = arrayService.avg(array);
        assertEqualDouble(expected, actual, "avgShouldReturnAVGElementsArray");
    }

    private void assertEqualInteger(int expected, int actual, String description) throws Exception {
        if (expected != actual) {
            throw new Exception(description + " has failed! \n" +
                    "Expected " + expected + " but was " + actual);
        } else {
            System.out.println(description + " has passed!");
        }
    }

    private void assertEqualDouble(double expected, double actual, String description) throws Exception {
        if (expected != actual) {
            throw new Exception(description + " has failed! \n" +
                    "Expected " + expected + " but was " + actual);
        } else {
            System.out.println(description + " has passed!");
        }
    }
}
