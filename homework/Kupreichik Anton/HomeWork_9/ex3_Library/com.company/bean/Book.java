package com.company.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Book implements Serializable {

    Map<String, String> books = new HashMap<>();

    public Book(String name, String author){
       books.put(name, author);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(books, book.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(books);
    }

    @Override
    public String toString() {
        return "Book{" +
                "books=" + books +
                '}';
    }
}
