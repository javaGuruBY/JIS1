package com.vladis1350.interfaces;

import com.vladis1350.exception.WrongPasswordException;

public interface CreditCardOperations {

    void deposit(int pinCode, double money) throws WrongPasswordException;
    void withdraw(int pinCode, double money) throws WrongPasswordException;
}
