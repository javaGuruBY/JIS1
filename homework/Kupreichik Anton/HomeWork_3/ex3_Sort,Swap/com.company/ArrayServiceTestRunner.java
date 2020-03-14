package com.company;
import com.company.test.ArrayServiceTest;

public class ArrayServiceTestRunner  {
    public static void main(String[] args) throws Exception {
        ArrayServiceTest arrayServiceTest = new ArrayServiceTest();

        arrayServiceTest.testShouldReturnSum();
        arrayServiceTest.testShouldReturnAvg();
        arrayServiceTest.testShouldReturnSort();
        arrayServiceTest.testShouldReturnSwap();
    }
}
