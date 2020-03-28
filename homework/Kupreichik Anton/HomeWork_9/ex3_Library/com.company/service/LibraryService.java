package com.company.service;

import com.company.bean.Book;
import com.company.bean.Library;

import java.util.ArrayList;
import java.util.List;

public class LibaryService {
    Library library = new Library();

    public void addBookToLibrary(Book book) {
        library.library.add(book);
    }

    public int getSize(){
        return library.library.size();
    }
    public void deleteBookFromLibrary(Book book) {
        library.library.remove(book);
    }

    public void findBookByName(String name) {
        List<Book> searchResult = new ArrayList<>();
        for (int i = 0; i < library.library.size() ; i++) {
            if(library.library.get(i).equals(name)){
                searchResult.add((Book) library.library.get(i));
            }
        }
    }

    public void returnBookWithAuthor(Book book) {
        book.library.stream().forEach(System.out::println);
    }

    public void returnAllBook() {
        library.library.stream().forEach(System.out::println);
    }

}
