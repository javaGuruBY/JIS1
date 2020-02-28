package by.jrr.service;

import by.jrr.main_user.User;

public class UserLoginService {
    public boolean login(User user, String password) {
        if (user.password.equals(password) && !user.blocked) {
            user.loginAttemptsBeforeBlocking++;
            return true;
        } else {
            user.loginAttemptsBeforeBlocking--;
            if (user.loginAttemptsBeforeBlocking <= 0) {
                user.blocked = true;
            }
            return false;
        }
    }
}
