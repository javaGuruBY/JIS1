package com.vladis1350;

import com.vladis1350.bean.User;
import com.vladis1350.service.UserLoginService;
import org.junit.Test;
import static org.junit.Assert.*;

public class UserLoginServiceTest {

    @Test
    public void testShouldAuthoriseTheSecondTime(){
        UserLoginService userLoginService = new UserLoginService();
        User user = new User("Vladislav", "122334455");

        boolean expectedResultOne = false;
        boolean expectedResultTwo = true;

        boolean actualResultOne = userLoginService.login(user, "1122334455");
        boolean actualResultTwo = userLoginService.login(user, "122334455");

        assertEquals(expectedResultOne, actualResultOne);
        assertEquals(expectedResultTwo, actualResultTwo);
    }

    @Test
    public void testShouldReturnFalseAfterThreeAttempts(){
        UserLoginService userLoginService = new UserLoginService();
        User user = new User("Vladislav", "122334455");
        boolean expectedResult = false;

        userLoginService.login(user, "1122334455");
        userLoginService.login(user, "1122334466");
        userLoginService.login(user, "1122334444");

        boolean actualResult = userLoginService.login(user, "122334455");

        assertEquals(expectedResult, actualResult);;
    }

    @Test
    public void testShouldAuthoriseTheThirdTime(){
        UserLoginService userLoginService = new UserLoginService();
        User user = new User("Vladislav", "122334455");
        boolean expectedResult = true;

        userLoginService.login(user, "1122334455");
        userLoginService.login(user, "1122334466");

        boolean actualResult = userLoginService.login(user, "122334455");

        assertEquals(expectedResult, actualResult);;
    }
}
