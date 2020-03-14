package com.company;
import com.company.test.LookupArrayTest;

public class LookupArrayTestRunner {
    public static void main(String[] args) throws Exception   {
    LookupArrayTest lookupArrayTest = new LookupArrayTest();
    lookupArrayTest.testShouldReturnMaxNumber();
    lookupArrayTest.testShouldReturnIndexOfMaxNumber();
    lookupArrayTest.testShouldReturnIndexOfMinNumber();
    lookupArrayTest.testShouldReturnMinNumber();
    lookupArrayTest.testShouldReturnIndexOfNumber();
    lookupArrayTest.testShouldReturnIfArrayIsEmpty();
    }
}
