package com.vladis1350.test;

public class UserTest {

    public static void main(String[] args) throws Exception {
        UserLoginServiceTest userLoginServiceTest = new UserLoginServiceTest();
        userLoginServiceTest.testShouldAuthorizeUserOnFirstAttempt();
        userLoginServiceTest.testShouldAuthorizeUserOnSecondAttempt();
        userLoginServiceTest.testShouldBlockedUserAfterThirdAttempt();
    }
}
