package com.company.test;
import com.company.service.UniqueWordCounter;

public class UniqueWordCounterTest{

    UniqueWordCounter uniqueWordCounter = new UniqueWordCounter();

    public void testShouldReturnMostFrequentWord() throws Exception {
        String string = "Hello world!";
        uniqueWordCounter.addWord("Приветик");
        uniqueWordCounter.addWord("Приветик");
        int  expectedResult = uniqueWordCounter.getMostFrequentWord();
        int actualResult = 2;

        assertEqualsInteger(expectedResult, actualResult, "testShouldReturnMostFrequentWord");
    }


    private void assertEqualsInteger(int expected, int actual, String description) throws Exception {
        if (expected != actual) {
            throw new Exception(description + " has failed! \n"+
                    "Expected '" + expected + "' but was '" + actual + "'");
        } else {
            System.out.println(description + " has passed!");
        }
    }
}

