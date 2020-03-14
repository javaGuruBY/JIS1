package by.jrr.thread;

import by.jrr.bean.Book;
import by.jrr.service.Library;

public class RunMyThread implements Runnable {
    @Override
    public void run() {
        Book firstBook = new Book("Maksim", "JavaGuru");
        Book secondBook = new Book("Danila", "Work");
        Book foundBook;

        Library library = new Library();

        library.setBookInLibrary(firstBook);
        library.setBookInLibrary(secondBook);

        foundBook = library.getBookByName("JavaGuru");
        System.out.println(foundBook.toString());

        foundBook = library.getBookByAuthor("Danila");
        System.out.println(foundBook.toString());

    }
}
