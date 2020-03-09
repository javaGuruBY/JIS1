package com.company.test;
import com.company.service.LookupArrayService;

public class LookupArrayTest  {

    LookupArrayService lookupArrayService = new LookupArrayService();

    public void testShouldReturnMaxNumber() throws Exception {
        int[] array = {1, -9, 7, 50, -63, 18 , 54, -9, 104};
        int expectedResult = lookupArrayService.findMax(array);
        int actualResult = 104;

        assertEqualsInteger(expectedResult, actualResult, "testShouldReturnMaxNumber");
    }

    public void testShouldReturnMinNumber() throws Exception {
        int[] array = {1, -9, 7, 50, -63, 18 , 54, -9, 104};
        int expectedResult = lookupArrayService.findMin(array);
        int actualResult = -63;

        assertEqualsInteger(expectedResult, actualResult, "testShouldReturnMinNumber");
    }

    public void testShouldReturnIndexOfMinNumber() throws Exception {
        int[] array = {1, -9, 7, 50, -63, 18 , 54, -9, 104};
        int expectedResult = lookupArrayService.indexOfMin(array);
        int actualResult = 4;

        assertEqualsInteger(expectedResult, actualResult, "testShouldReturnIndexOfMinNumber");
    }
    public void testShouldReturnIndexOfMaxNumber() throws Exception {
        int[] array = {1, -9, 7, 50, -63, 18 , 54, -9, 104};
        int expectedResult = lookupArrayService.indexOfMax(array);
        int actualResult = 8;

        assertEqualsInteger(expectedResult, actualResult, "testShouldReturnIndexOfMaxNumber");
    }
    public void testShouldReturnIndexOfNumber() throws Exception {
        int[] array = {1, -9, 7, 50, -63, 18 , 54, -9, 104};
        int expectedResult = lookupArrayService.indexOf(array, -9);
        int actualResult = 1;

        assertEqualsInteger(expectedResult, actualResult, "testShouldReturnIndexOfNumber");
    }

    public void testShouldReturnIfArrayIsEmpty() throws Exception {
        int[] array = new int[0];
        int expectedResult = lookupArrayService.indexOf(array, -9);
        int actualResult = -1;

        assertEqualsInteger(expectedResult, actualResult, "testShouldReturnIfArrayIsEmpty");
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
