package com.company;
import com.company.test.TVTest;


public class TVTestsRunner {
    public static void main(String[] args) throws Exception {
        TVTest tvTest = new TVTest();
        tvTest.testShouldWorkWhenIncreaseChannelIsTrue();
        tvTest.testShouldWorkWhenReduceChannelIsTrue();
        tvTest.testShouldWorkWhenIncreaseVolumeIsTrue();
        tvTest.testShouldWorkWhenReduceVolumeIsTrue();

    }
}
