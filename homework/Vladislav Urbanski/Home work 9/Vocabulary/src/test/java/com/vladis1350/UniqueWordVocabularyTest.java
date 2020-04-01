package com.vladis1350;

import com.vladis1350.services.UniqueWordVocabulary;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UniqueWordVocabularyTest {
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

    UniqueWordVocabulary firstVocabulary = context.getBean("uniqueWordVocabulary", UniqueWordVocabulary.class);

    public void getWordsCountShouldReturnNumberUniqueWords() throws Exception {
        firstVocabulary.addWord("I like a java");
        firstVocabulary.addWord("I like a java Spring");
        firstVocabulary.addWord("I like a java Collections");
        firstVocabulary.addWord("I like a java Arrays");
        firstVocabulary.addWord("I like a java");

        int expected = 4;
        int actual = firstVocabulary.getWordsCount();

        assertEqualInteger(expected, actual, "getWordsCountShouldReturnNumberUniqueWords");
    }

    private void assertEqualInteger(int expected, int actual, String description) throws Exception {
        if (expected != actual) {
            throw new Exception(description + " has failed! \n" +
                    "Expected " + expected + " but was " + actual);
        } else {
            System.out.println(description + " has passed!");
        }
    }
}
