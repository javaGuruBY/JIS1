package by.jrr.exceptions;

import by.jrr.messages.Message;

public class UserValidationException extends Exception {
    public UserValidationException(String message) {
        super(message);
    }
}
