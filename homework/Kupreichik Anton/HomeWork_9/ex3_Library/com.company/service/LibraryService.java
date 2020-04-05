package com.company.service;

import com.company.bean.Book;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static com.company.bean.Book.booksMap;
import static com.company.bean.Library.libraryMap;

public class LibraryService {

    public void addBookToLibrary(Book book) {
        libraryMap.add(book);
        System.out.println("Книга добавлена!");
    }

    public int getSize() {
        System.out.print("Кол-тво книг в библиотеке =");
        return libraryMap.size();
    }

    public void deleteBookFromLibrary(Book book) {
        libraryMap.remove(book);
        System.out.println("Книга удалена!");
    }

    public void findBookByAuthor(String authorBook) {
        Collection<String> collection = booksMap.keySet();
        for (String key : collection) {
            Object obj = booksMap.get(key);
            if (key != null) {
                if (authorBook.equals(obj)) {
                    System.out.print(key + " ");
                }
            }
        }
    }

    public void findBookByName(String name) {
        System.out.println(booksMap.get(name));
    }

    public void returnAllBook() {
        libraryMap.toString();
    }

}
