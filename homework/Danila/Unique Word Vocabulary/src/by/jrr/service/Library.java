package by.jrr.service;

import by.jrr.bean.Book;
import by.jrr.interfaces.InterfaceOfLibrary;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Library implements InterfaceOfLibrary {

    List<Book> list = new ArrayList<>();

    @Override
    public void setBookInLibrary(Book book) {
        list.add(book);
    }

    @Override
    public void deleteBookFromLibrary(Book book) {
        list.remove(book);
    }

    @Override
    public Book getBookByName(String name) {
        return findBook(name, "name");
    }

    @Override
    public Book getBookByAuthor(String author) {
        return findBook(author, "author");
    }

    private Book findBook(String parameter, String name) {
        if(name.equals("name")) {
            for (Book entry : list) {
                if(entry.getNameBook().equals(parameter)) {
                    return entry;
                }
            }
        }
        else {
            for (Book entry : list) {
                if(entry.getAuthorBook().equals(parameter)) {
                    return entry;
                }
            }
        }
        return null;
    }
}
