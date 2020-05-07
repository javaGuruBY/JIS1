package com.vladis1350.lambdasApp;

import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConsumerClass {

    public static void consumerOperatorMethod(String text) {
        Pattern pattern = Pattern.compile("J.+!");
        Matcher matcher = pattern.matcher(text);
        Consumer<String> printText = x -> {
            while (matcher.find()) {
                System.out.println(text.substring(matcher.start(), matcher.end()));
            }
        };
        printText.accept(text);

    }

}
