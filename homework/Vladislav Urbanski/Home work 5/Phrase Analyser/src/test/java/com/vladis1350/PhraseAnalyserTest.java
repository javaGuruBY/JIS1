package com.vladis1350;

import com.vladis1350.service.PhraseAnalyser;

public class PhraseAnalyserTest {

    public static void main(String[] args) {
        PhraseAnalyserTest analyserTest = new PhraseAnalyserTest();

        analyserTest.test1();
        analyserTest.test2();
        analyserTest.test3();
        analyserTest.test4();
    }

    public void test1() {
        String description = "Should say 'It stands no chance'";

        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();
        String expectedResult = phraseAnalyser.getAndMakeAndGreatAgain();
        String actualResult = phraseAnalyser.analyse("Make [some text] great again");

        tellMeTruth(expectedResult, actualResult, description);
    }

    public void test2() {
        String description = "Should say 'It could be worse'";

        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();
        String expectedResult = phraseAnalyser.getOrMakeOrGreatAgain();
        String actualResult = phraseAnalyser.analyse("Make [some text] great");

        tellMeTruth(expectedResult, actualResult, description);
    }

    public void test3() {
        String description = "Should say 'It could be worse'";

        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();
        String expectedResult = phraseAnalyser.getOrMakeOrGreatAgain();
        String actualResult = phraseAnalyser.analyse("Some text great again");

        tellMeTruth(expectedResult, actualResult, description);
    }

    public void test4() {
        String description = "Should say 'It is fine, really'";

        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();
        String expectedResult = phraseAnalyser.getNone();
        String actualResult = phraseAnalyser.analyse("Again some text here");

        tellMeTruth(expectedResult, actualResult, description);
    }

    public void tellMeTruth(String expected, String actual, String description) {
        if (expected.equals(actual)) {
            System.out.println(description + " has passed!");
        } else {
            System.out.println(description + " has failed!");
            System.out.println("Expected '" + expected + "' but was '" + actual + "'");
        }
    }

}
