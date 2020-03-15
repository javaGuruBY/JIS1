package test;

import sesrvice.UniqueWordCounter;

public class UniqueWordVocabularyTest {

    public void testRunner () throws Exception {
        shouldReturn2Words();
    }

    void shouldReturn2Words () throws Exception {
        UniqueWordCounter testVocabulary = new UniqueWordCounter();
        String expected = "First";
        testVocabulary.addWord("First");
        testVocabulary.addWord("First");
        testVocabulary.addWord("First");
        testVocabulary.addWord("Second");
        testVocabulary.addWord("Second");
        testVocabulary.addWord("Third");
        String actual = testVocabulary.getMostFrequentWord();
        String description = "Test for adding words and word counter has ";
        assertsEqualsString(description,expected,actual);
    }


    void assertsEqualsString (String desription, String expected, String actual) throws Exception {
        if (expected.equals(actual)) {
            System.out.println(desription + "passed");
        } else {
            throw new Exception(desription + "FAILED!");
        }
    }
}
