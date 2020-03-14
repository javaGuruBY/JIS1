package by.jrr.interfaces;

import by.jrr.bean.Book;

public interface InterfaceOfLibrary {
    void setBookInLibrary(Book book);
    void deleteBookFromLibrary(Book book);
    Book getBookByName(String name);
    Book getBookByAuthor(String author);
}
