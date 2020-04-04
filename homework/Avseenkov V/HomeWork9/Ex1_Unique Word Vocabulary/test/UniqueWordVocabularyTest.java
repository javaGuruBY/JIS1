package test;

import sesrvice.UniqueWordVocabulary;

public class UniqueWordVocabularyTest {

    public void testRunner (){
        shouldReturn2Words();
    }

    void shouldReturn2Words (){
        UniqueWordVocabulary testVocabulary = new UniqueWordVocabulary();
        int expected = 3;
        testVocabulary.addWord("First");
        testVocabulary.addWord("First");
        testVocabulary.addWord("First");
        testVocabulary.addWord("Second");
        testVocabulary.addWord("Second");
        testVocabulary.addWord("Third");
        int actual = testVocabulary.getWordsCount();
        String description = "Test for adding words and word counter has ";

    }


    void assertsEqualsInteger (String desription, int expected, int actual) throws Exception {
        if (expected == actual) {
            System.out.println(desription + "passed");
        } else {
            throw new Exception(desription + "FAILED!");
        }
    }
}
