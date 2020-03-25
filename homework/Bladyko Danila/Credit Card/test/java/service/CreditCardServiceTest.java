package service;

import bean.CreditCard;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CreditCardServiceTest {
    CreditCard creditCard;
    CreditCardService creditCardService;

    @Before
    public void setUp() throws Exception {
        creditCard = new CreditCard(123, "1234");
        creditCardService = new CreditCardService();
    }

    @Test
    public void shouldReturnFiveHundred() {
        creditCardService.deposit(creditCard, "1234", 500);

        float actualResult = creditCard.balance;
        float expectedResult = 500;

        Assert.assertEquals(expectedResult, actualResult, 0);
    }

    @Test
    public void shouldReturnZero() {
        creditCardService.deposit(creditCard, "1234", 250);
        creditCardService.withDraw(creditCard, "1234", 250);

        float actualResult = creditCard.balance;
        float expectedResult = 0;

        Assert.assertEquals(expectedResult, actualResult, 0);
    }
}
