package com.company;
import com.company.bean.Book;
import com.company.service.LibraryService;

public class Main {

    public static void main(String[] args) {
        Book bookOne = new Book("War and Peace", "Leo Tolstoy");
        Book bookTwo = new Book("Anna Karenina", "Leo Tolstoy");
        Book bookThree = new Book("Schoolgirl", "Tara Vestover");
        LibraryService library = new LibraryService();

        library.addBookToLibrary(bookOne);
        library.addBookToLibrary(bookTwo);
        library.addBookToLibrary(bookThree);

        library.findBookByName("War and Peace");  //Should return bookOne
        library.findBookByAuthor("Leo Tolstoy"); //Should return bookOne, bookTwo​
        library.deleteBookFromLibrary(bookTwo);

        library.returnAllBook();
    }
}
