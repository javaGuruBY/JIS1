package com.company.test;
import com.company.service.ArrayService;

public class ArrayServiceTest {
    ArrayService arrayService = new ArrayService();

    public void testShouldReturnSum() throws Exception {
        int[] array = {1, -9, 7, 50, -63, 18 , 54, -9, 104};
        int expectedResult = arrayService.sum(array);
        int actualResult = 153;

        assertEqualsInteger(expectedResult, actualResult, "testShouldReturnSum");
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

    private void assertEqualsDouble(double expected, double actual, String description) throws Exception {
        if (expected != actual) {
            throw new Exception(description + " has failed! \n"+
                    "Expected '" + expected + "' but was '" + actual + "'");
        } else {
            System.out.println(description + " has passed!");
        }
    }
}
