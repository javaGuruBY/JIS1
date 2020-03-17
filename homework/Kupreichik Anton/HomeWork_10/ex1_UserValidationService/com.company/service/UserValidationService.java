package com.company.service;

public class UserValidationService {
    public void validate(User user) {
        try {
            if(user.getAge() > 120 || user.getAge() < 3)
                throw new UserValidationException("Возраст должен быть от 3 до 120");
            if(user.getLastName().length() < 3 || user.getLastName().length() > 15)
                throw new UserValidationException("Имя должна быть от 3 до 15 символов");
            if(user.getFirstName().length() < 3 || user.getFirstName().length() > 15)
                throw new UserValidationException("Фамилия должна быть от 3 до 15 символов");
        } catch (UserValidationException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
