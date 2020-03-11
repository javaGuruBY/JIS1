package com.company.service;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class UniqueWordVocabulary implements Runnable {
    public void run(){
        addWord("Привет");
        addWord("Меня зовут Антон!");
        addWord("Как твои дела?");
        System.out.println("Вот столько слов в словаре - " + getWordsCount());
        printVocabulary();
    }
    Set<String> words = new HashSet<>();
    public void addWord(String word){
        words.add(word);
        System.out.println("Успешно добавлено в словарь");
    }

    public int getWordsCount(){
        return words.size();
    }

    public void printVocabulary(){
        words.stream().forEach(System.out::println);
    }

    public UniqueWordVocabulary() { };

    public Set<String> getWords() {
        return words;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UniqueWordVocabulary that = (UniqueWordVocabulary) o;
        return Objects.equals(words, that.words);
    }

    @Override
    public int hashCode() {
        return Objects.hash(words);
    }


    @Override
    public String toString() {
        return "UniqueWordVocabulary{" +
                "words=" + words +
                '}';
    }

}
