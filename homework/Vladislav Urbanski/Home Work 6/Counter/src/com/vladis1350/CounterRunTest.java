package com.vladis1350;

import com.vladis1350.tests.CounterTest;

public class CounterRunTest {
    public static void main(String[] args) throws Exception {
        CounterTest counterTest = new CounterTest();

        counterTest.incrementShouldIncreaseValueByGivenStep();
        counterTest.decrementShouldDecreaseValueByGivenStep();
        counterTest.resetShouldResetValueToInitial();
        counterTest.setNotShouldAcceptValueSmaller0AndMore100();
    }
}
