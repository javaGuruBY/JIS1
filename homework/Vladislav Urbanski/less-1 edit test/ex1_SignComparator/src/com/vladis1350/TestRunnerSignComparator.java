package com.vladis1350;

import com.vladis1350.test.SignComparatorTest;

public class TestRunnerSignComparator {
    public static void main(String[] args) throws Exception {
        SignComparatorTest signComparatorTest = new SignComparatorTest();
        signComparatorTest.testExpectedResultGreaterZero();
        signComparatorTest.testExpectedResultLessZero();
        signComparatorTest.testExpectedResultZero();
    }
}
