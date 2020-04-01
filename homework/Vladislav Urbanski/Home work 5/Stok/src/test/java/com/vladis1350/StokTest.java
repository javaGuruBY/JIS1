package com.vladis1350;

import com.vladis1350.bean.Stok;

public class StokTest {

    public static void main(String[] args) {
        StokTest stokTest = new StokTest();
        stokTest.testShouldReturnCurrent9();
        stokTest.testShouldReturnMin6();
        stokTest.testShouldReturnMax52_2();
        stokTest.testShouldCurrentPrice51_6();
    }

    public void testShouldReturnCurrent9() {
        Stok stok = new Stok("Adidas", 15);
        stok.updatePrice(16);
        stok.updatePrice(7);
        stok.updatePrice(9);
        String expectedResult = "Company = 'Adidas' Current Price = 9.0, Min Price = 7.0, Max Price = 16.0";
        String actualResult = stok.printInformation();
        String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        tellMeTruth(expectedResult, actualResult, testName);
    }

    public void testShouldReturnMin6() {
        Stok stok = new Stok("Puma", 6);
        stok.updatePrice(7);
        stok.updatePrice(19.9);
        stok.updatePrice(13.2);
        String expectedResult = "Company = 'Puma' Current Price = 13.2, Min Price = 6.0, Max Price = 19.9";
        String actualResult = stok.printInformation();
        String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        tellMeTruth(expectedResult, actualResult, testName);
    }

    public void testShouldCurrentPrice51_6() {
        Stok stok = new Stok("Nike", 15);
        stok.updatePrice(10);
        stok.updatePrice(9.9);
        stok.updatePrice(9);
        String expectedResult = "Company = 'Nike' Current Price = 9.0, Min Price = 9.0, Max Price = 15.0";
        String actualResult = stok.printInformation();
        String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        tellMeTruth(expectedResult, actualResult, testName);
    }

    public void testShouldReturnMax52_2() {
        Stok stok = new Stok("Supreme", 50);
        stok.updatePrice(49.9);
        stok.updatePrice(52.2);
        stok.updatePrice(51.6);
        String expectedResult = "Company = 'Supreme' Current Price = 51.6, Min Price = 49.9, Max Price = 52.2";
        String actualResult = stok.printInformation();
        String testName = new Object(){}.getClass().getEnclosingMethod().getName();
        tellMeTruth(expectedResult, actualResult, testName);
    }

    public void tellMeTruth(String expected, String actual, String testName) {
        if (expected.equals(actual)) {
            System.out.println("Test '" + testName + "' passed successfully!");
        } else {
            System.out.println("Test '" + testName + "' failed!");
            System.out.println("Expected '" + expected + "' but was '" + actual + "'");
        }
    }
}
