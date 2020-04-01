package com.vladis1350.bean;

import java.util.HashMap;
import java.util.Map;


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
        for (Map.Entry<String, Integer> entryMap: uniqueWordList.entrySet()) {
            if (entryMap.getValue() > maxCount) {
                maxCount = entryMap.getValue();
            }

        }
        return searchByValue(maxCount);
    }

    public String searchByValue(int value) {
        String result = "";
        for (Map.Entry<String, Integer> entryMap: uniqueWordList.entrySet()) {
            if (entryMap.getValue() == value) {
                result = entryMap.getKey();
            }
        }
        return result;
    }

    public void printWordsFrequency() {
        for (Map.Entry<String, Integer> entryMap: uniqueWordList.entrySet()) {
            System.out.println(entryMap.getKey() + " = " + entryMap.getValue());
        }
    }
}
