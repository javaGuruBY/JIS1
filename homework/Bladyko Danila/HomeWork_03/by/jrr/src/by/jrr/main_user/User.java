package by.jrr.main_user;

public class User {
    public String login;
    public static String password;
    public boolean blocked;
    public int loginAttemptsBeforeBlocking;

    public User(String s, String s1) {

    }

    public User(String password) {
        this.password = password;
    }

    public User(String login, String password, int loginAttemptsBeforeBlocking) {
        this.login = login;
        this.password = password;
        this.loginAttemptsBeforeBlocking = loginAttemptsBeforeBlocking;
    }

    public void resetTheNumbersOfAttempts() {
        this.loginAttemptsBeforeBlocking = 0;
    }

    public void block() {
        this.blocked = true;
    }

    public void password(String pass) {
        User.password = pass;
    }


    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", blocked=" + blocked +
                ", loginAttemptsBeforeBlocking=" + loginAttemptsBeforeBlocking +
                '}';
    }
}
