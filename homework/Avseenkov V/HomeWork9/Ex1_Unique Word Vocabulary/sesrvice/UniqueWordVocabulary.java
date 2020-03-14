package sesrvice;

import com.sun.xml.internal.fastinfoset.vocab.Vocabulary;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
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
