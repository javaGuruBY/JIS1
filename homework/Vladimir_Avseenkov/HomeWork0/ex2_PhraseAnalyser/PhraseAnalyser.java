package Vladimir_Avseenkov.HomeWork0.ex2_PhraseAnalyser;

public class PhraseAnalyser {
    String makeAndGreatAgain = "It stands no chance";
    String makeOrGreatAgain = "It could be worse";
    String notMakeAndGreatAgain = "It's fine, really";
    String someText;

    public String analyse (String text) {
        if (text.startsWith("Make") && text.endsWith("great again")) {
           return getMakeAndGreatAgain();
        } else if (text.startsWith("Make") || text.endsWith("great again")) {
            return getMakeOrGreatAgain();
        } else {
           return getNotMakeAndGreatAgain();
        }
    }

    public String getMakeAndGreatAgain() {
        return makeAndGreatAgain;
    }

    public String getMakeOrGreatAgain() {
        return makeOrGreatAgain;
    }

    public String getNotMakeAndGreatAgain() {
        return notMakeAndGreatAgain;
    }
}
