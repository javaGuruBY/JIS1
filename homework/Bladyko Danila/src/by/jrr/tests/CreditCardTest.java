package by.jrr.tests;

import by.jrr.bean.CreditCard;

public class CreditCardTest {
    CreditCard creditCard;

    public void testShouldWriteFiveThousand() throws Exception {
        creditCard = new CreditCard(1234, "1234567890");

        creditCard.deposit("1234567890", 5000);

        int actualDepositResult = creditCard.withDraw("1234567890", 5000);

        int expectedDepositResult = 5000;

        int notExpectedResult = 1245;

        assertEqualInt(actualDepositResult, expectedDepositResult, "Test1");
        assertNotEqualInt(actualDepositResult, notExpectedResult, "Test1");
    }

    private void assertEqualInt(int actualDepositResult, int expectedDepositResult, String testName) throws Exception {
        if (actualDepositResult == expectedDepositResult) {
            System.out.println(testName + " has passed!");
        } else {
            throw new Exception("\n" + testName + " is failed!\n" + "Expected " + expectedDepositResult + " and  but was " + actualDepositResult);
        }
    }

    private void assertNotEqualInt(int actualResultResult, int notExpectedDepositResult, String testName) throws Exception {
        if (actualResultResult != notExpectedDepositResult) {
            System.out.println(testName + " has passed!");
        } else {
            throw new Exception("\n" + testName + " is failed!\n" + "Expected " + notExpectedDepositResult + " and but was " + actualResultResult);
        }
    }
}
