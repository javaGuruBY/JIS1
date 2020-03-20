import bean.Book;
import service.Library;

public class app {

    public static void main(String[] args) {
        Library bookLibrary = new Library();
        Book book0 = new Book("Leo Tolstoy", "War and peace");
        Book book1 = new Book("Leo Tolstoy", "Anna Karenina");
        Book book2 = new Book("Gerber Shildt", "Java 8");
        Book book3 = new Book("Horse", "Fignya under the horse");

        bookLibrary.addBook(book0);
        bookLibrary.addBook(book1);
        bookLibrary.addBook(book2);
        bookLibrary.addBook(book3);

        bookLibrary.removeBook(book3);

        bookLibrary.findBookByName("Java 8");
        bookLibrary.returnAllBooksByAuthor("Leo Tolstoy");

        System.out.println(bookLibrary.toString());

    }
}
