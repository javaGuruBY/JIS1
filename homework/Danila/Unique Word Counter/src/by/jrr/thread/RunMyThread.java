package by.jrr.thread;

import by.jrr.bean.UniqueWordVocabulary;

public class RunMyThread implements Runnable {
    @Override
    public void run() {
        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();

        uniqueWordVocabulary.addWord("Hello");
        uniqueWordVocabulary.addWord("Maksim");

        uniqueWordVocabulary.printWordsFrequency();

        uniqueWordVocabulary.addWord("Hello");
        uniqueWordVocabulary.getMostFrequentWord();
        uniqueWordVocabulary.printWordsFrequency();
    }
}
