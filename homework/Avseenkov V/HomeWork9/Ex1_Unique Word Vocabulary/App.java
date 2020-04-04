import sesrvice.UniqueWordVocabulary;
import test.UniqueWordVocabularyTest;

public class App {
    public static void main(String[] args) {
        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();
        UniqueWordVocabularyTest test = new UniqueWordVocabularyTest();
        for (int i = 0; i < 3; i++) {
            uniqueWordVocabulary.addWord("Shalom");
        }
        uniqueWordVocabulary.addWord("JavaGuru");
        uniqueWordVocabulary.addWord("Shalom slavyane");
        uniqueWordVocabulary.addWord("JavaGuru");

        System.out.println("Total words in vocabulary " + uniqueWordVocabulary.getWordsCount());
        uniqueWordVocabulary.printVocabulary();

        test.testRunner();
    }
}
