package com.vladis1350;

import com.vladis1350.services.UniqueWordVocabulary;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        UniqueWordVocabulary firstVocabulary = context.getBean("uniqueWordVocabulary", UniqueWordVocabulary.class);

        firstVocabulary.addWord("Hello Vlad");
        firstVocabulary.addWord("Hello Vov4eg");
        firstVocabulary.addWord("Hello Danila");
        firstVocabulary.addWord("Hello Anton");
        firstVocabulary.addWord("Hello Anton");


        firstVocabulary.printVocabulary();
        System.out.println(firstVocabulary.getWordsCount());


    }
}
