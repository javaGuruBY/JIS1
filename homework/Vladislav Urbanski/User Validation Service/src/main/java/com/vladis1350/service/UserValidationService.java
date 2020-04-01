package com.vladis1350.service;

import com.vladis1350.bean.User;
import com.vladis1350.exceptions.UserValidationException;
import com.vladis1350.exceptions.UserValidationExceptionInAge;
import com.vladis1350.exceptions.UserValidationExceptionInFirstName;
import com.vladis1350.exceptions.UserValidationExceptionInLastName;
import com.vladis1350.messages.UserServiceLimitations;
import com.vladis1350.messages.UserServiceMessage;

public class UserValidationService {

    public void validate(User user) throws UserValidationException {
        if (!checkFirstName(user)){
            throw new UserValidationExceptionInFirstName(UserServiceMessage.FIRST_NAME);
        } else if(!checkLastName(user)) {
            throw new UserValidationExceptionInLastName(UserServiceMessage.LAST_NAME);
        } else if (!checkAge(user)) {
            throw new UserValidationExceptionInAge(UserServiceMessage.AGE);
        }
    }

    public boolean checkFirstName(User user) {
        return user.getFirstName().length() >= UserServiceLimitations.MIN_FIRST_AND_LAST_NAME
                && user.getFirstName().length() <= UserServiceLimitations.MAX_FIRST_AND_LAST_NAME;
    }

    public boolean checkLastName(User user) {
        return user.getLastName().length() >= UserServiceLimitations.MIN_FIRST_AND_LAST_NAME
                && user.getLastName().length() <= UserServiceLimitations.MAX_FIRST_AND_LAST_NAME;
    }

    public boolean checkAge(User user) {
        return user.getAge() > UserServiceLimitations.MIN_AGE
                && user.getAge() < UserServiceLimitations.MAX_AGE;
    }
}
