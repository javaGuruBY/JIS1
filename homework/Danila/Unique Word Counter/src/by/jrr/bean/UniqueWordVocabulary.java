package by.jrr.bean;

import by.jrr.interfaces.WordVocabulary;

import java.util.HashMap;
import java.util.Map;


public class UniqueWordVocabulary implements WordVocabulary {
    Map<String, Integer> map = new HashMap<>();

    @Override
    public void addWord(String word) {
        if(!this.map.containsKey(word)) {
            this.map.put(word, 1);
            return;
        }
        int firstValue = map.get(word);
        map.put(word, firstValue + 1);
    }

    @Override
    public String getMostFrequentWord() {
        int maxValue = 0;
        String answer = null;
        for (Map.Entry entry : map.entrySet()) {
            if(maxValue < (int) entry.getValue()) {
                maxValue = (int) entry.getValue();
                answer = (String) entry.getKey();
            }
        }
        return answer;
    }

    @Override
    public void printWordsFrequency() {
        for (Map.Entry entry: map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

}
