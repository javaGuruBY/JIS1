package com.vladis1350.test;

import com.vladis1350.bean.Stok;

public class StokTest {

    public void testShouldVerifyNameCompany() throws Exception {
        Stok stok = new Stok("JavaGuru", 20);
        String expectedResultPositive = "JavaGuru";

        String actualResultPositive = stok.getNameCompany();

        assertEqualStringInfoCompany(expectedResultPositive, actualResultPositive, "testShouldVerifyNameCompany");
    }

    public void testShouldInfoCompanyAfterOneAndFourUpdate() throws Exception {
        Stok stok = new Stok("JavaGuru", 15);
        stok.updatePrice(11);
        String expectedResultPositiveOne = "Company = 'JavaGuru' Current Price = 11.0, Min Price = 11.0, Max Price = 15.0";
        String actualResultPositiveOne = stok.printInformation();
        stok.updatePrice(19);
        stok.updatePrice(15);
        stok.updatePrice(7);
        String expectedResultPositiveTwo = "Company = 'JavaGuru' Current Price = 7.0, Min Price = 7.0, Max Price = 19.0";
        String actualResultPositiveTwo = stok.printInformation();

        assertEqualStringInfoCompany(expectedResultPositiveOne, actualResultPositiveOne, "testShouldInfoCompanyAfterOneAndFourUpdate - One");
        assertEqualStringInfoCompany(expectedResultPositiveTwo, actualResultPositiveTwo, "testShouldInfoCompanyAfterOneAndFourUpdate - Four");
    }

    public void testShouldInfoCompanyAfterThirdUpdate() throws Exception {
        Stok stok = new Stok("JavaGuru", 20);
        String expectedResultPositive = "Company = 'JavaGuru' Current Price = 15.0, Min Price = 11.0, Max Price = 20.0";
        stok.updatePrice(11);
        stok.updatePrice(19);
        stok.updatePrice(15);
        String actualResultPositive = stok.printInformation();

        assertEqualStringInfoCompany(expectedResultPositive, actualResultPositive, "testShouldInfoCompanyAfterThirdUpdate");
    }

    public void testShouldInfoCompanyAfterSecondUpdate() throws Exception {
        Stok stok = new Stok("JavaGuru", 14);
        String expectedResultPositive = "Company = 'JavaGuru' Current Price = 19.0, Min Price = 11.0, Max Price = 19.0";
        stok.updatePrice(11);
        stok.updatePrice(19);
        String actualResultPositive = stok.printInformation();

        assertEqualStringInfoCompany(expectedResultPositive, actualResultPositive, "testShouldInfoCompanyAfterSecondUpdate");
    }

    public void testShouldInfoCompanyAfterOneUpdate() throws Exception {
        Stok stok = new Stok("JavaGuru", 25);
        String expectedResultPositive = "Company = 'JavaGuru' Current Price = 20.0, Min Price = 20.0, Max Price = 25.0";
        stok.updatePrice(20);
        String actualResultPositive = stok.printInformation();

        assertEqualStringInfoCompany(expectedResultPositive, actualResultPositive, "testShouldInfoCompanyAfterOneUpdate");
    }

    private void assertEqualStringInfoCompany(String expectedResult, String actualResult, String descriptionTest) throws Exception {
        if(!expectedResult.equals(actualResult)) {
            throw new Exception(descriptionTest + " has failed!" + "\n" +
                    "Expected " + expectedResult + " but was " + actualResult);
        } else {
            System.out.println(descriptionTest + " has passed!");
        }
    }

}
