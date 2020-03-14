package com.vladis1350.service;

import com.vladis1350.bean.User;

public class UserLoginService {
    public boolean login(User user, String password) {
        if (user.getUserPassword().equals(password) && user.getCountAttempt() != 0) {
//            System.out.println("User: " + user.getUserLogin() + " authorized!");
            user.droppingAttempt();
//            System.out.println("Count attempt " + user.getCountAttempt());
            return true;
        } else if(!user.getUserPassword().equals(password) && user.getCountAttempt() != 0){
            user.setCountAttempt(user.getCountAttempt() - 1);
//            System.out.println("Wrong password! Count attempt " + user.getCountAttempt());
            return false;
        } else {
            user.blockUser();
            System.out.println(user.getUserLogin() + " we are blocked!");
        } return false;

    }
}
