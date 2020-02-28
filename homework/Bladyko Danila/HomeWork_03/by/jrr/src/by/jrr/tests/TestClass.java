package by.jrr.tests;

public class TestClass {

    public static void main(String[] args) throws Exception {
        UserServiceTest serviceTest = new UserServiceTest();

        serviceTest.testShouldAuthorizeUser();
        serviceTest.testNotShouldAuthorizeUser();
    }
}
