package com.vladis1350.exceptions;

public class UserValidationException extends Exception {

    public UserValidationException() {
    }

    public UserValidationException(String message) {
        super(message);
    }

}
