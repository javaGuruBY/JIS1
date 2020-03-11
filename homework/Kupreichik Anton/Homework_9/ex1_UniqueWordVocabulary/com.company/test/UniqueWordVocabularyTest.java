package com.company.test;
import com.company.service.UniqueWordVocabulary;

public class UniqueWordVocabularyTest   {

    UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();

    public void testShouldReturnNewCountOfWords() throws Exception {
        String string = "Hello world!";
        uniqueWordVocabulary.addWord(string);
        int  expectedResult = uniqueWordVocabulary.getWordsCount();
        int actualResult = 1;

        assertEqualsInteger(expectedResult, actualResult, "testShouldReturnNewCountOfWords");
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

