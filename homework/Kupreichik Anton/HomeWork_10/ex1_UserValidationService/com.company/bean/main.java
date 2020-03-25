package com.company.bean;

import com.company.service.User;
import com.company.service.UserValidationException;
import com.company.service.UserValidationService;

public class Main {

    public static void main(String[] args)throws UserValidationException {
        User user = new User();
        user.setAge(81);
        user.setFirstName("Dolluy");
        user.setLastName("Iodd");
        UserValidationService userValidationService = new UserValidationService();
        userValidationService.validate(user);


    }
}
