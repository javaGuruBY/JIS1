package com.vladis1350;

import com.vladis1350.test.PhraseAnalyserTest;

public class TestRunnerPhraseAnalyser {
    public static void main(String[] args) throws Exception {
        PhraseAnalyserTest phraseAnalyserTest = new PhraseAnalyserTest();
        phraseAnalyserTest.testShouldWorkWhenBeginningLineMake();
        phraseAnalyserTest.testShouldWorkWhenTwoConditionsMet();
        phraseAnalyserTest.testShouldWorkWhenEndLineGreatAgain();
        phraseAnalyserTest.testShouldWorkWhenConditionsNotMet();
    }
}
