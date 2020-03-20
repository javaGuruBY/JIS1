package service;

import bean.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {

    List<Book> libraryList = new ArrayList<>();

    public void addBook(Book book) {
        libraryList.add(book);
    }

    public void removeBook(Book book) {
        libraryList.remove(book);
        System.out.println("Deleting " + book.getName() + " completed");
    }

    public void findBookByName(String name) {
        for (Book book : libraryList) {
            if (book.getAuthor().equals(name)) {
                System.out.println("Finded: '" + book.getAuthor() + "' by " + book.getName());
            }
        }
    }

    public void returnAllBooksByAuthor(String author) {
        System.out.println("Search result for " + author + ":");
        List<String> returnList = new ArrayList<>();
        for (Book book : libraryList) {
            if (book.getAuthor().equals(author)) {
                System.out.print(book.getName() + ", ");
            }
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Library " + libraryList;
    }

    public int getSize() {
        return libraryList.size();
    }
}
