package by.jrr.thread;

import by.jrr.bean.UniqueWordVocabulary;

public class RunMyThread implements Runnable {
    @Override
    public void run() {
        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();

        uniqueWordVocabulary.addWord("Hello");
        uniqueWordVocabulary.addWord("Maksim");

        System.out.println("uniqueWordVocabulary.getWordsCount() = " + uniqueWordVocabulary.getWordsCount());

        uniqueWordVocabulary.addWord("Hello");
        uniqueWordVocabulary.printVocabulary();
        System.out.println("uniqueWordVocabulary.getWordsCount() = " + uniqueWordVocabulary.getWordsCount());
    }
}
