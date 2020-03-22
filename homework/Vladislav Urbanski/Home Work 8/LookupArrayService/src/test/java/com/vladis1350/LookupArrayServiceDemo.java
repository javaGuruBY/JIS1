package com.vladis1350;

public class LookupArrayServiceDemo {
    public static void main(String[] args) throws Exception {
        LookupArrayServiceTest test = new LookupArrayServiceTest();
        test.findMaxShouldReturnMaxValue();
        test.findMinShouldReturnMinValue();
        test.indexOfMaxShouldReturnIndexMaxValue();
        test.indexOfMinShouldReturnIndexMinValue();
        test.indexOfShouldReturnIndexValue();
    }
}
