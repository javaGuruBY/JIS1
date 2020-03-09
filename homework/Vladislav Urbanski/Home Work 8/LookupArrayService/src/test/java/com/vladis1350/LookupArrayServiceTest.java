package com.vladis1350;

import com.vladis1350.service.LookupArrayService;

public class LookupArrayServiceTest {

    int[] array = {1, 9, 4, 6, -5, 17, -9};

    public void findMaxShouldReturnMaxValue() throws Exception {
        LookupArrayService lookupArrayService = new LookupArrayService();

        int expected = 17;
        int actual = lookupArrayService.findMax(array);
        assertEqualInteger(expected, actual, "findMaxShouldReturnMaxValue");
    }

    public void findMinShouldReturnMinValue() throws Exception {
        LookupArrayService lookupArrayService = new LookupArrayService();

        int expected = -9;
        int actual = lookupArrayService.findMin(array);
        assertEqualInteger(expected, actual, "findMinShouldReturnMinValue");
    }

    public void indexOfMinShouldReturnIndexMinValue() throws Exception {
        LookupArrayService lookupArrayService = new LookupArrayService();

        int expected = 6;
        int actual = lookupArrayService.indexOfMin(array);
        assertEqualInteger(expected, actual, "indexOfMinShouldReturnIndexMinValue");
    }

    public void indexOfMaxShouldReturnIndexMaxValue() throws Exception {
        LookupArrayService lookupArrayService = new LookupArrayService();

        int expected = 5;
        int actual = lookupArrayService.indexOfMax(array);
        assertEqualInteger(expected, actual, "indexOfMaxShouldReturnIndexMaxValue");
    }

    public void indexOfShouldReturnIndexValue() throws Exception {
        LookupArrayService lookupArrayService = new LookupArrayService();

        int expected = 0;
        int actual = lookupArrayService.indexOf(array, 1);
        assertEqualInteger(expected, actual, "indexOfShouldReturnIndexValue");
    }

    private void assertEqualInteger(int expected, int actual, String description) throws Exception {
        if (expected != actual) {
            throw new Exception(description + " has failed! \n" +
                    "Expected " + expected + " but was " + actual);
        } else {
            System.out.println(description + " has passed!");
        }
    }
}
