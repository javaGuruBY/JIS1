package com.vladis1350.tests;

import com.vladis1350.service.Copy;

import java.util.Arrays;

public class CopyTest {

    public void testShouldReturnArrayInGivenRange() throws Exception {
        Copy copy = new Copy();
        int[] array = {6, 96, 36, 56, 26, 16, 86, 46, 66, 76};
        int[] expected = {56, 46, 66, 76};
        int[] actual = copy.copyInRange(array, 40, 80);
        assertEqualIntArray(expected, actual, "testShouldReturnArrayInGivenRange");
    }

    private void assertEqualIntArray(int[] expected, int[] actual, String description) throws Exception {
        if (!Arrays.equals(expected, actual)) {
            throw new Exception(description + " has failed! \n" +
                    "Expected " + expected + " but was " + actual);
        } else {
            System.out.println(description + " has passed!");
        }
    }
}
