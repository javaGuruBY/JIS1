import sesrvice.UniqueWordVocabulary;

public class App {
    public static void main(String[] args) {
        UniqueWordVocabulary uniqueWordVocabulary = new UniqueWordVocabulary();
        for (int i = 0; i < 3; i++) {
            uniqueWordVocabulary.addWord("Shalom");
        }
        uniqueWordVocabulary.addWord("JavaGuru");
        uniqueWordVocabulary.addWord("Shalom slavyane");
        uniqueWordVocabulary.addWord("JavaGuru");
        System.out.println("Total unique words in vocabulary " + uniqueWordVocabulary.getWordsCount());
        uniqueWordVocabulary.printVocabulary();
    }
}
