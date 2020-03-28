import bean.Book;
import service.Library;

public class app {

    public static void main(String[] args) {
        Library bookLibrary = new Library();
        bookLibrary.addBook(new Book("Leo Tolstoy", "War and peace"));
        bookLibrary.addBook(new Book("Leo Tolstoy", "Anna Karenina"));
        bookLibrary.addBook(new Book("Gerber Shildt", "Java 8"));
        bookLibrary.addBook(new Book("Horse", "Fignya iz-pod konya"));

        bookLibrary.removeBook(new Book("Horse", "Fignya iz-pod konya"));

        bookLibrary.findBookByName("Java 8");
        bookLibrary.returnAllBooksByAuthor("Leo Tolstoy");

        System.out.println(bookLibrary.toString());

    }
}
