package com.vladis1350.bean;

import java.util.HashMap;
import java.util.Map;

/**
 * void addWord(String word) - добавляет строку и считает количество раз, которое она была добавлена;
 * int getMostFrequentWord() - возвращает строку, которая была добавлена чаще всего;
 * void printWordsFrequency() - печатает на экран содержимое коллекции, а также количество раз, которое слово было добавлено;
 * */
public class UniqueWordCounter {
    Map<String, Integer> uniqueWordList = new HashMap<>();
    private int count = 1;


    public void addWord(String word) {
        if (uniqueWordList.containsKey(word)) {
            uniqueWordList.put(word, uniqueWordList.get(word) + 1);
        } else {
            uniqueWordList.put(word, count);
        }
    }

    public String getMostFrequentWord() {
        int maxCount = 1;
        for (Map.Entry<String, Integer> map: uniqueWordList.entrySet()) {
            if (map.getValue() > maxCount) {
                maxCount = map.getValue();
            }

        }
        return searchByValue(maxCount);
    }

    public String searchByValue(int value) {
        String result = "";
        for (Map.Entry<String, Integer> map: uniqueWordList.entrySet()) {
            if (map.getValue() == value) {
                result = map.getKey();
            }
        }
        return result;
    }

    public void printWordsFrequency() {
        for (Map.Entry<String, Integer> map: uniqueWordList.entrySet()) {
            System.out.println(map.getKey() + " = " + map.getValue());
        }
    }
}
