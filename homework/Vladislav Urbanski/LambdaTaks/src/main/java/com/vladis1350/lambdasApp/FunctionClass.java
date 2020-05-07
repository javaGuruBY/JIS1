package com.vladis1350.lambdasApp;

import java.util.function.Function;

public class FunctionClass {

    public static String functionOperatorMethod(String number, Integer s) {
        Function<String, Integer> convertToInteger = num -> Integer.parseInt(number);
        Function<Integer, String> convertToString = x -> convertToInteger.apply(number) + s + " WeLL, VERY FUNNY!!!";
        return convertToString.apply(s);
    }
}
