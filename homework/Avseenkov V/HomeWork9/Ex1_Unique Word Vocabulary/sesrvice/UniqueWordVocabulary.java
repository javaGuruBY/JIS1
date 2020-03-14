package sesrvice;

import com.sun.xml.internal.fastinfoset.vocab.Vocabulary;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashMap;
import java.util.Map;

public class UniqueWordVocabulary {
    int count = 1;
    Map<String, Integer> vocabulary = new HashMap<>();

    public void addWord(String word) {
        if (vocabulary.containsKey(word)) {
            int countAdd = vocabulary.get(word) + 1;
            vocabulary.replace(word, countAdd);
        } else {
            vocabulary.put(word, count);
        }

    }

    public int getWordsCount() {
        return vocabulary.size();
    }

    public void printVocabulary() {
        System.out.println(vocabulary);
    }
}
