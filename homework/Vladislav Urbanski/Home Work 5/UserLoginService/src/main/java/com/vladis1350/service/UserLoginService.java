package com.vladis1350.service;

import com.vladis1350.bean.User;
import com.vladis1350.constant.UserConstant;

public class UserLoginService {

    public boolean login(User user, String password) {
        if (user.getUserPassword().equals(password)) {
            user.droppingAttempt();
            return true;
        } else {
            user.setCountAttempt(user.getCountAttempt() - 1);
            checkNumberAttempt(user, user.getCountAttempt());
            return false;
        }
    }

    private void checkNumberAttempt(User user, int attempt) {
        if (attempt >= UserConstant.NUMBER_ATTEMPT) {
            user.blockUser();
        }
    }
}
