package com.vladis1350.services;

import com.vladis1350.bean.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    List<Book> listBook = new ArrayList<>();

    public Library() {
    }

    public void addAllBook(List<Book> bookList){
        listBook.addAll(bookList);
    }

    public void addBook(Book book) {
        if (listBook.add(book)) {
            System.out.println("Book: " + book.getName() + ", Author: " + book.getAuthor() + " added!");
        }
    }

    public void removeBook(Book book) {
        if (listBook.remove(book)) {
            System.out.println("Book: " + book.getName() + ", Author: " + book.getAuthor() + " removed!");
        }
    }

    public Book findByName(String nameBook) {
        for (int i = 0; i < listBook.size(); i++) {
            if (listBook.get(i).getName().equals(nameBook)) {
                return listBook.get(i);
            }
        }
        return null;
    }

    public List<Book> findByAuthor(String authorBook) {
        List<Book> searchResult = new ArrayList<>();
        for (int i = 0; i < listBook.size(); i++) {
            if (listBook.get(i).getAuthor().equals(authorBook)) {
                searchResult.add(listBook.get(i));
            }
        }
        return searchResult;
    }

    public List<Book> getListBook() {
        return listBook;
    }
}
