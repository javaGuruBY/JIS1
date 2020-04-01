package by.jrr.bean;

import by.jrr.interfaces.WordVocabulary;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary implements WordVocabulary {
    Set<String> word = new HashSet<>();

    @Override
    public void addWord(String word) {
        this.word.add(word);
    }

    @Override
    public void printVocabulary() {
        System.out.println(this.word);
    }

    @Override
    public int getWordsCount() {
        return this.word.size();
    }
}
