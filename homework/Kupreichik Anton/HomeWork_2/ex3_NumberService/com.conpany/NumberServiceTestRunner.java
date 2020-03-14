package com.company;
import com.company.service.NumberService;
import com.company.test.NumberServiceTest;


public class NumberServiceTestRunner {
    public static void main(String[] args) throws Exception {
        NumberServiceTest numberServiceTest = new NumberServiceTest();
        numberServiceTest.testShouldWorkWhenInRangeSumFinishLargerStart();
        numberServiceTest.testShouldWorkWhenInRangeSumStartLargerFinish();
        numberServiceTest.testShouldWorkWhenInRangeSumFinishEqualsStart();
        numberServiceTest.testShouldWorkWhenInRangeEvenCountFinishEqualsStartAndThisNumberIsEven();
        numberServiceTest.testShouldWorkWhenInRangeEvenCountFinishEqualsStartAndThisNumbersIsntEven();
        numberServiceTest.testShouldWorkWhenInRangeEvenCountFinishLargerStart();
        numberServiceTest.testShouldWorkWhenInRangeEvenCountStartLargerFinish();
    }
}
