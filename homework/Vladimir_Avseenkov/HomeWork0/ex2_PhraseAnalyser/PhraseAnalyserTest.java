package Vladimir_Avseenkov.HomeWork0.ex2_PhraseAnalyser;

public class PhraseAnalyserTest {
    PhraseAnalyser phraseAnalyser = new PhraseAnalyser();

    public void assertEqualsString(String expected, String actual, String description) throws Exception {
        if (actual.equals(expected)) {
            System.out.println(description + " passed!");
        } else {
            throw new Exception(description + " FAILED");
        }
    }

    public void runTest() throws Exception {
        sholudReturnItCouldBeWorseBeginOfLine();
        sholudReturnItCouldBeWorseEndOfLine();
        shouldReturnItsFineReally();
        shouldReturnItsStandsNoChance();
    }

    public void shouldReturnItsStandsNoChance() throws Exception {
        String description = "Test for make AND great again";
        String expected = phraseAnalyser.getMakeAndGreatAgain();
        String actual = phraseAnalyser.analyse("Make something somewhere great again");
        assertEqualsString(expected, actual, description);
    }

    public void sholudReturnItCouldBeWorseBeginOfLine() throws Exception {
        String description = "Test for make OR great again";
        String expected = phraseAnalyser.getMakeOrGreatAgain();
        String actual = phraseAnalyser.analyse("Let's do grandfather samogon great again");
        assertEqualsString(expected, actual, description);

    }

    public void sholudReturnItCouldBeWorseEndOfLine() throws Exception {
        String description = "Test for make OR great again (second test)";
        String expected = phraseAnalyser.getMakeOrGreatAgain();
        String actual = phraseAnalyser.analyse("Make fun with sudo rm -rf");
        assertEqualsString(expected, actual, description);

    }

    public void shouldReturnItsFineReally() throws Exception {
        String description = "Test for other text";
        String expected = phraseAnalyser.getNotMakeAndGreatAgain();
        String actual = phraseAnalyser.analyse("Кто-нибудь кроме Максима вообще вчитавается в то, что мы пишем? :)");
        assertEqualsString(expected, actual, description);

    }
}
