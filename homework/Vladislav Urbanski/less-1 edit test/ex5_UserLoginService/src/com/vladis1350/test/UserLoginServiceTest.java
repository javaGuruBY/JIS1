package com.vladis1350.test;

import com.vladis1350.bean.User;
import com.vladis1350.service.UserLoginService;

public class UserLoginServiceTest {

    public void testShouldAuthorizeUserOnFirstAttempt() throws Exception {
        UserLoginService userLoginService = new UserLoginService();
        User user = new User("Vladislav", "122334455");

        boolean expectedResult = true;
        boolean actualResult = userLoginService.login(user, "122334455");

        assertEqualBoolean(expectedResult, actualResult, "testShouldAuthorizeUserOnFirstAttempt");
    }

    public void testShouldAuthorizeUserOnSecondAttempt() throws Exception {
        UserLoginService userLoginService = new UserLoginService();
        User user = new User("Vladislav", "122334455");

        boolean expectedResultPositive = true;
        boolean expectedResultNegative = false;

        boolean actualResultNegative = userLoginService.login(user, "5234123124");
        boolean actualResultPositive = userLoginService.login(user, "122334455");

        assertEqualBoolean(expectedResultPositive, actualResultPositive, "testShouldAuthorizeUserOnSecondAttempt");
        assertEqualBoolean(expectedResultNegative, actualResultNegative, "testShouldAuthorizeUserOnSecondAttempt");
    }

    public void testShouldAuthorizeUserOnThirdAttempt() throws Exception {
        UserLoginService userLoginService = new UserLoginService();
        User user = new User("Vladislav", "122334455");
        boolean expectedResultPositive = true;
        boolean expectedResultNegative = false;

        userLoginService.login(user, "1122334455");
        boolean actualResultNegative = userLoginService.login(user, "1142334455");

        boolean actualResultPositive = userLoginService.login(user, "122334455");

        assertEqualBoolean(expectedResultPositive, actualResultPositive, "testShouldAuthorizeUserOnThirdAttempt");
        assertEqualBoolean(expectedResultNegative, actualResultNegative, "testShouldAuthorizeUserOnThirdAttempt");
    }

    public void testShouldBlockedUserAfterThirdAttempt() throws Exception {
        UserLoginService userLoginService = new UserLoginService();
        User user = new User("Vladislav", "122334455");
        boolean expectedResultPositive = false;
        boolean expectedResultNegative = false;

        userLoginService.login(user, "123c123e1");
        userLoginService.login(user, "124151b513");

        boolean actualResultPositive = userLoginService.login(user, "142334455");
        boolean actualResultNegative = userLoginService.login(user, "122334455");

        assertEqualBoolean(expectedResultPositive, actualResultPositive, "testShouldBlockedUserAfterThirdAttempt");
        assertEqualBoolean(expectedResultNegative, actualResultNegative, "testShouldBlockedUserAfterThirdAttempt");
    }

    private void assertEqualBoolean(boolean expectedResult, boolean actualResult, String descriptionTest) throws Exception {
        if (expectedResult != actualResult) {
            throw new Exception(descriptionTest + " has failed!" +
                    "Expected " + expectedResult + " but was " + actualResult);
        } else {
            System.out.println(descriptionTest + " has passed!");
        }
    }

}
