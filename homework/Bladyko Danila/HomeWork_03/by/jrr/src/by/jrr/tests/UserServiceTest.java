package by.jrr.tests;

import by.jrr.main_user.User;
import by.jrr.service.UserLoginService;

public class UserServiceTest {

    protected void testShouldAuthorizeUser() throws Exception {
        UserLoginService service = new UserLoginService();
        User user = new User("user-login", "user-password", 3);

        service.login(user, "user-password");

        boolean actualResult1 = service.login(user, "user-password");
        boolean expectedResult1 = true;

        user.password("Hi, Reviewer!");

        boolean actualResult2 = service.login(user, "Hi, Rviewer!");
        boolean expectedResult2 = true;

        assertEqualBoolean(actualResult1, expectedResult1, "testShouldAuthorizeUser");
        assertEqualBoolean(actualResult2, expectedResult2, "testShouldAuthorizeUser");
    }

    protected void testNotShouldAuthorizeUser() throws Exception {
        UserLoginService service = new UserLoginService();
        User user = new User("user-login", "user-password", 3);

        service.login(user, "admin");

        boolean actualResult1 = service.login(user, "user");
        boolean expectedResult1 = false;

        user.password("Goodbye, Reviewer!");

        boolean actualResult2 = service.login(user, "Hi, Reviewer!");
        boolean expectedResult2 = false;

        assertNotEqualBoolean(actualResult1, expectedResult1, "testNotShouldAuthorizeUser");
        assertNotEqualBoolean(actualResult2, expectedResult2, "testNotShouldAuthorizeUser");
    }

    private void assertEqualBoolean(boolean actualResult, boolean expectedResult, String testName) throws Exception {
        if (actualResult == expectedResult) {
            System.out.println(testName + " has passed!");
        } else {
            throw new Exception("\n" + testName + " is failed!\n" + "Expected \"" + expectedResult + "\" but was \"" + actualResult + "\"");
        }
    }

    private void assertNotEqualBoolean(boolean actualResult, boolean expectedResult, String testName) throws Exception {
        if (actualResult == expectedResult) {
            System.out.println(testName + " has passed!");
        } else {
            throw new Exception("\n" + testName + " is failed!\n" + "Expected \"" + expectedResult + "\" but was \"" + actualResult + "\"");
        }
    }
}
