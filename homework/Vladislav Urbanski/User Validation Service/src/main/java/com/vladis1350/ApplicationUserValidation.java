package com.vladis1350;

import com.vladis1350.bean.User;
import com.vladis1350.exceptions.UserValidationException;
import com.vladis1350.exceptions.UserValidationExceptionInAge;
import com.vladis1350.exceptions.UserValidationExceptionInFirstName;
import com.vladis1350.exceptions.UserValidationExceptionInLastName;
import com.vladis1350.service.UserValidationService;

import java.util.ArrayList;
import java.util.List;

public class ApplicationUserValidation {
    public static void main(String[] args) {
        User userFirstNameLessThree = new User("Vl", "Urbanski", 24);
        User userLastNameLessThree = new User("Vlad", "Is", 20);
        User userAgeMore120 = new User("Vlad", "Urbanski", 122);

        List<User> users = new ArrayList<>();
        users.add(userFirstNameLessThree);
        users.add(userLastNameLessThree);
        users.add(userAgeMore120);

        UserValidationService validationService = new UserValidationService();
        for (User user : users) {
            try {
                validationService.validate(user);
            } catch (UserValidationException e) {
                System.err.println(user.toString() + ": " + e.getMessage());
            }
        }
    }
}
