package com.vladis1350.bean;

public class User {
    private String userLogin;
    private String userPassword;
    private boolean userHasAccess;
    private int countAttempt;

    public User() {}

    public User(String userLogin, String userPassword) {
        this.userLogin = userLogin;
        this.userPassword = userPassword;
        this.userHasAccess = true;
        this.countAttempt = 3;
    }

    public void droppingAttempt() {
        setCountAttempt(3);
    }

    public void blockUser() {
        if (userHasAccess) {
            setUserHasAccess(false);
        } else {
            setUserHasAccess(true);
        }
    }

    public boolean isUserHasAccess() {
        return userHasAccess;
    }

    public void setUserLogin(String userLogin) {
        this.userLogin = userLogin;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserLogin() {
        return userLogin;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserHasAccess(boolean userHasAccess) {
        this.userHasAccess = userHasAccess;
    }

    public int getCountAttempt() {
        return countAttempt;
    }

    public void setCountAttempt(int countAttempt) {
        this.countAttempt = countAttempt;
    }

    @Override
    public String toString() {
        return "User: " +
                "userLogin='" + userLogin + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userAccess=" + userHasAccess +
                ", countAttempt=" + countAttempt;
    }
}
