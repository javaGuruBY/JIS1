package com.vladis1350.services;

import com.vladis1350.interfaces.UniqueWordVocabularyInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

@Component
public class UniqueWordVocabulary implements UniqueWordVocabularyInterface {

    private Set<String> stringSet;

    @Autowired
    public UniqueWordVocabulary(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

    public UniqueWordVocabulary() {
    }

    public Set<String> getStringSet() {
        return stringSet;
    }

    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

    @Override
    public void addWord(String word) {
        stringSet.add(word);
    }

    @Override
    public int getWordsCount() {
        return stringSet.size();
    }

    @Override
    public void printVocabulary() {
        stringSet.stream().forEach(System.out::println);
    }
}
