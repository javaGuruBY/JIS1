package com.company;
import com.company.bean.Book;
import com.company.bean.Library;
import com.company.service.LibaryService;

public class Main {

    public static void main(String[] args) {
        Book bookOne = new Book("War and Peace", "Leo Tolstoy");
        Book bookTwo = new Book("Anna Karenina", "Leo Tolstoy");

        LibaryService library = new LibaryService();

        library.addBookToLibrary(bookOne);
        library.addBookToLibrary(bookTwo);

        library.findBookByName("Anna Karenina");
        library.returnBookWithAuthor(bookOne);
        library.deleteBookFromLibrary(bookOne);

        library.returnAllBook();
        }
}
