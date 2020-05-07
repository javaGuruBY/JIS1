package com.vladis1350.lambdasApp;

import java.util.function.UnaryOperator;

public class UnaryOperatorClass {

    public static String unaryOperatorMethod(String text) {
        UnaryOperator<String> notSpace = x -> text.trim();
        return notSpace.apply(text);
    }
}
