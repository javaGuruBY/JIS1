import sesrvice.UniqueWordCounter;
import test.UniqueWordVocabularyTest;

public class App {
    public static void main(String[] args) throws Exception {
        UniqueWordCounter uniqueWordCounter = new UniqueWordCounter();
        UniqueWordVocabularyTest test = new UniqueWordVocabularyTest();
        for (int i = 0; i < 3; i++) {
            uniqueWordCounter.addWord("Shalom");
        }
        uniqueWordCounter.addWord("JavaGuru");
        uniqueWordCounter.addWord("Shalom slavyane");
        uniqueWordCounter.addWord("JavaGuru");

        System.out.println("Most frequent word is " + uniqueWordCounter.getMostFrequentWord());
        uniqueWordCounter.printVocabulary();

        test.testRunner();
    }
}
