package com.vladis1350;

import com.vladis1350.bean.UniqueWordCounter;
import com.vladis1350.configuration.SpringConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UniqueWordCounterTest implements Runnable {
    AnnotationConfigApplicationContext applicationContext =
            new AnnotationConfigApplicationContext(SpringConfig.class);

    UniqueWordCounter uniqueWordCounter = applicationContext.getBean("uniqueWordCounter", UniqueWordCounter.class);

    public void testShouldReturnMostFrequentWord() throws Exception {
        uniqueWordCounter.addWord("java");
        uniqueWordCounter.addWord("c++");
        uniqueWordCounter.addWord("php");
        uniqueWordCounter.addWord("php");
        uniqueWordCounter.addWord("java");
        uniqueWordCounter.addWord("java");
        String expected = "java";
        String actual = uniqueWordCounter.getMostFrequentWord();
        assertEqualString(expected, actual, "testShouldReturnMostFrequentWord");
    }
    

    private void assertEqualString(String expected, String actual, String description) throws Exception {
        if (!expected.equals(actual)) {
            throw new Exception(description + " has failed! \n" +
                    "Expected " + expected + " but was " + actual);
        } else {
            System.out.println(description + " has passed!");
        }
    }

    @Override
    public void run() {
        try {
            testShouldReturnMostFrequentWord();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
