package sesrvice;

import java.util.HashSet;
import java.util.Set;

public class UniqueWordVocabulary {
    Set<String> vocabulary = new HashSet<>();

    public void addWord(String word) {
        if (word != null) {
            vocabulary.add(word);
        }
    }

    public int getWordsCount() {
        return vocabulary.size();
    }

    public void printVocabulary() {
        System.out.println(vocabulary);
    }
}
