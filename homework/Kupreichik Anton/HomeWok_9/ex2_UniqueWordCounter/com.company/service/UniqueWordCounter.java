package com.company.service;

import java.io.PrintStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


public class UniqueWordCounter implements Runnable {
    public int count;
    public int size;

    public void run() {
        addWord("Привет");
        addWord("Привет!");
        addWord("Привет!");
        addWord("Привет!");
        addWord("Приветик");
        addWord("Приветик");

        System.out.println("Максимальное кол-тво добавлений:" + getMostFrequentWord() + " раз(a)" );
        printWordsFrequency();
        words.keySet().stream().forEach(System.out::println);
    }

    Map<String, Integer> words = new HashMap<>();

    public void addWord(String word) {
        count = 1;
        size = words.size();
        if (!words.containsKey(word)) {
            words.put(word, count);
        } else {
            int countNew = words.get(word);
            words.put(word, countNew + 1);
        }
    }

    public int getMostFrequentWord() {
        int count = 0;
        for(String key : words.keySet()){
            Integer value = words.get(key);
            if(value > count) count = value;
        }


        return count;
    }


    public void printWordsFrequency() {
        System.out.println(words);
    } // печатает на экран содержимое коллекции, а также количество раз, которое слово было добавлено

}
