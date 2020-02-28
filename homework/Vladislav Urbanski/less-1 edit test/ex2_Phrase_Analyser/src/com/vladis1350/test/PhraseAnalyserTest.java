package com.vladis1350.test;

import com.vladis1350.service.PhraseAnalyser;

public class PhraseAnalyserTest {

    PhraseAnalyser phraseAnalyser = new PhraseAnalyser();

    public void testShouldWorkWhenTwoConditionsMet() throws Exception {

        String expectedResult = phraseAnalyser.getAndMakeAndGreatAgain();
        String actualResult = phraseAnalyser.analyse("Make [some text] great again");

        assertEqualsString(expectedResult, actualResult, "testShouldWorkWhenTwoConditionsMet");
    }

    public void testShouldWorkWhenBeginningLineMake() throws Exception {
        String expectedResult = phraseAnalyser.getOrMakeOrGreatAgain();
        String actualResult = phraseAnalyser.analyse("Make [some text] great");

        assertEqualsString(expectedResult, actualResult, "testShouldWorkWhenBeginningLineMake");
    }

    public void testShouldWorkWhenEndLineGreatAgain() throws Exception {
        String expectedResult = phraseAnalyser.getOrMakeOrGreatAgain();
        String actualResult = phraseAnalyser.analyse("Some text great again");

        assertEqualsString(expectedResult, actualResult, "testShouldWorkWhenEndLineGreatAgain");
    }

    public void testShouldWorkWhenConditionsNotMet() throws Exception {
        String expectedResult = phraseAnalyser.getNone();
        String actualResult = phraseAnalyser.analyse("Again some text here");

        assertEqualsString(expectedResult, actualResult, "testShouldWorkWhenConditionsNotMet");
    }

    private void assertEqualsString(String expected, String actual, String description) throws Exception {
        if (!expected.equals(actual)) {
            throw new Exception(description + " has failed! \n"+
                    "Expected '" + expected + "' but was '" + actual + "'");
        } else {
            System.out.println(description + " has passed!");
        }
    }
}
