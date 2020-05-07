package com.vladis1350;

import com.vladis1350.lambdasApp.*;

public class App {
    public static void main(String[] args) {
        System.out.println(PredicateClass.predicateMethod(13, 4));
        System.out.println(BinaryOperatorClass.binaryOperatorMethod(3, 16));
        System.out.println(UnaryOperatorClass.unaryOperatorMethod("  i very love java!                         "));
        System.out.println(FunctionClass.functionOperatorMethod("3760", 12));
        ConsumerClass.consumerOperatorMethod("Тут какой то не понятный текст пока не появилась Java, Java то круто! тра та та снова какой то текст.");
        System.out.println(SupplierClass.supplierOperatorMethod("I LoVe JaVa tHis teXt in LOver CaSE"));
    }


}
