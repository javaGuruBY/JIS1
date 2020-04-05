package com.company.bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Book implements Serializable {
    private String name;
    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public static Map<String, String> booksMap = new HashMap<>();

    public Book(String name, String author) {
        booksMap.put(name, author);
    }

    public Book() {
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name) &&
                Objects.equals(author, book.author) &&
                Objects.equals(booksMap, book.booksMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, booksMap);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", booksMap=" + booksMap +
                '}';
    }
}
