package com.vladis1350.lambdasApp;

import java.util.function.Predicate;

public class PredicateClass {

    public static boolean predicateMethod(int a, int c) {
        Predicate<Integer> isPositive = z -> z < a;
        return isPositive.test(c);
    }
}
