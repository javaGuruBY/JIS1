package by.jrr.service;

import by.jrr.bean.User;
import by.jrr.exceptions.UserValidationAge;
import by.jrr.exceptions.UserValidationException;
import by.jrr.exceptions.UserValidationName;
import by.jrr.exceptions.UserValidationSurname;
import by.jrr.messages.Message;

public class UserValidationService {
    public static void validate(User user) {
        try {
            if(!checkSizeName(user)) {
                throw new Exception(new UserValidationName(Message.NAME));
            }
            if(!checkSizeSurname(user)) {
                throw new Exception(new UserValidationSurname(Message.SURNAME));
            }
            if(!checkSizeAge(user)) {
                throw new Exception(new UserValidationAge(Message.AGE));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static boolean checkSizeName(User user) {
        return user.firstName.length() >= 3 && user.firstName.length() <= 15;
    }

    private static boolean checkSizeSurname(User user) {
        return user.lastName.length() >= 3 && user.lastName.length() <= 15;
    }

    private static boolean checkSizeAge(User user) {
        return user.age >= 0 && user.age <= 120;
    }
}
