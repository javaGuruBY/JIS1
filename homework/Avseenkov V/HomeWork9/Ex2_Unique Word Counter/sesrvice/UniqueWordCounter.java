package sesrvice;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordCounter {
    Map<String, Integer> vocabulary = new HashMap<>();

    public void addWord(String word) {
        int count = 1;
        if (vocabulary.containsKey(word)) {
            count = vocabulary.get(word) + 1;
            vocabulary.replace(word, count);
        } else {
            vocabulary.put(word, count);
        }

    }

    public String getMostFrequentWord() {
        int i = 0;
        for (String key : vocabulary.keySet()) {
            int value = vocabulary.get(key);
            if (value > i) {
                i = value;
            }
        }
        String result = "";
        for  (Map.Entry<String, Integer> value: vocabulary.entrySet()) {
            if (value.getValue() == i) {
                result = value.getKey();
            }
        }
        return result;
    }


    public void printVocabulary() {
        System.out.println(vocabulary);
    }
}
