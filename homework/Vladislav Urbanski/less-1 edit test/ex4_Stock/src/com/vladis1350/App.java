package com.vladis1350;

import com.vladis1350.test.StokTest;

public class App {
    public static void main(String[] args) throws Exception {
        StokTest stokTest = new StokTest();
        stokTest.testShouldVerifyNameCompany();
        stokTest.testShouldInfoCompanyAfterOneUpdate();
        stokTest.testShouldInfoCompanyAfterSecondUpdate();
        stokTest.testShouldInfoCompanyAfterThirdUpdate();
        stokTest.testShouldInfoCompanyAfterOneAndFourUpdate();
    }
}
