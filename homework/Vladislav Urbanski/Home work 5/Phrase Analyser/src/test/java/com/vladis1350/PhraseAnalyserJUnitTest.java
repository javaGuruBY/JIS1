package com.vladis1350;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import com.vladis1350.service.PhraseAnalyser;

public class PhraseAnalyserJUnitTest {

    PhraseAnalyser phraseAnalyser = new PhraseAnalyser();

    @Test
    public void testMustBeSatisfiedWhenBothConditionsAreMet() {
        String expectedResult = phraseAnalyser.getAndMakeAndGreatAgain();
        String actualResult = phraseAnalyser.analyse("Make [some text] great again");
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testMustBeSatisfiedWhenBothConditionsIsMetAtTheAnd() {
        String expectedResult = phraseAnalyser.getOrMakeOrGreatAgain();
        String actualResult = phraseAnalyser.analyse("Some text] great again");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testMustBeSatisfiedWhenBothConditionsIsMetAtTheBeginning() {
        String expectedResult = phraseAnalyser.getOrMakeOrGreatAgain();
        String actualResult = phraseAnalyser.analyse("Make [some text] great");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testShouldReturnFalse() {
        String expectedResult = phraseAnalyser.getNone();
        String actualResult = phraseAnalyser.analyse("Great some text again");
        assertEquals(expectedResult, actualResult);
    }
}
