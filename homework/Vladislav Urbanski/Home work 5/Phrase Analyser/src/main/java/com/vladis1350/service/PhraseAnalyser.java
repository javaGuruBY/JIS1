package com.vladis1350.service;

public class PhraseAnalyser {
    private String andMakeAndGreatAgain = "It stands no chance";
    private String orMakeOrGreatAgain = "It could be worse";
    private String none = "It is fine, really";
    String[] arrayWords;

    public String analyse(String text) {
        arrayWords = text.split(" ");
        int lengthArray = arrayWords.length - 1;
        String endLine = arrayWords[lengthArray - 1] + " " + arrayWords[lengthArray];

        if (arrayWords[0].equals("Make") && endLine.equals("great again")) {
            return getAndMakeAndGreatAgain();
        } else if (arrayWords[0].equals("Make") || endLine.equals("great again")) {
            return getOrMakeOrGreatAgain();
        } else {
            return getNone();
        }
    }

    public String getAndMakeAndGreatAgain() {
        return andMakeAndGreatAgain;
    }

    public String getOrMakeOrGreatAgain() {
        return orMakeOrGreatAgain;
    }

    public String getNone() {
        return none;
    }
}
