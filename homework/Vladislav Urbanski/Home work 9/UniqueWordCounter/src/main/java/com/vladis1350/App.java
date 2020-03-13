package com.vladis1350;

import com.vladis1350.bean.UniqueWordCounter;
import com.vladis1350.configuration.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        UniqueWordCounter uniqueWordCounter = applicationContext.getBean("uniqueWordCounter", UniqueWordCounter.class);
        uniqueWordCounter.addWord("Hello world");
        uniqueWordCounter.addWord("Hello world");
        uniqueWordCounter.addWord("Hello World");
        uniqueWordCounter.addWord("Hello Vlad");
        uniqueWordCounter.addWord("Hello Vlad");
        uniqueWordCounter.addWord("Hello Vlados");
        uniqueWordCounter.addWord("Hello Vlad");

        uniqueWordCounter.printWordsFrequency();
        System.out.println(uniqueWordCounter.getMostFrequentWord());
    }
}
