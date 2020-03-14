package Vladimir_Avseenkov.HomeWork0.ex2_PhraseAnalyser;

public class PhraseAnalyserDemo {
    public static void main(String[] args) throws Exception {
        PhraseAnalyser phraseAnalyser = new PhraseAnalyser();
        System.out.println(phraseAnalyser.analyse("Make Republic of Bulbastan great again"));
        System.out.println(phraseAnalyser.analyse("Let's do something great again"));
        System.out.println(phraseAnalyser.analyse("Bla-Bla-Bla"));
    }

}
