package com.vladis1350.lambdasApp;

import java.util.function.Supplier;

public class SupplierClass {
    public static String supplierOperatorMethod(String text) {
        Supplier<String> stringSupplier = text::toLowerCase;
        return stringSupplier.get();
    }
}
