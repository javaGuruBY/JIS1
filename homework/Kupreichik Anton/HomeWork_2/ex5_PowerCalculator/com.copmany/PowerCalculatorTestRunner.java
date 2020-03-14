package com.company;
import com.company.test.PowerCalculateTest;

public class PowerCalculatorTestRunner {
    public static void main(String[] args)  throws Exception {
    PowerCalculateTest powerCalculateTest = new PowerCalculateTest();
    powerCalculateTest.test1ShouldWorkWhenMethodWorksCorrectly();
    powerCalculateTest.test2ShouldWorkWhenMethodWorksCorrectly();
    }
}
