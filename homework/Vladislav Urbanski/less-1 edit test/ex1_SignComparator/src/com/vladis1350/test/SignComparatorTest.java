package com.vladis1350.test;

import com.vladis1350.service.SignComparator;

public class SignComparatorTest {
    SignComparator signComparator = new SignComparator();

    public void testExpectedResultGreaterZero() throws Exception {
        String expectedResult = signComparator.getMore();
        String actualResult = signComparator.compare(5);

        assertEqualString(expectedResult, actualResult, "testExpectedResultGreaterZero");
    }

    public void testExpectedResultLessZero() throws Exception {
        String expectedResult = signComparator.getLess();
        String actualResult = signComparator.compare(-7);

        assertEqualString(expectedResult, actualResult, "testExpectedResultLessZero");
    }

    public void testExpectedResultZero() throws Exception {
        String expectedResult = signComparator.getEqualZero();
        String actualResult = signComparator.compare(0);

        assertEqualString(expectedResult, actualResult, "testExpectedResultZero");
    }

    public void assertEqualString(String expectedResult, String actualResult, String testDescription) throws Exception {
        if(!actualResult.equals(expectedResult)) {
            throw new Exception(testDescription + " has failed!" +
                    "Expected '" + expectedResult + "' but was '" + actualResult +"'");
        } else {
            System.out.println(testDescription + " has passed!");
        }
    }
}
