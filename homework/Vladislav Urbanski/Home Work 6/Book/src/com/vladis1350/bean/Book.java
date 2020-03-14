package com.vladis1350.bean;

import java.util.Objects;

public class Book {
    private String author;
    private String name;
    private int numberPage;

    public Book() {
    }

    public Book(String author, String name, int numberPage) {
        this.author = author;
        this.name = name;
        this.numberPage = numberPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberPage() {
        return numberPage;
    }

    public void setNumberPage(int numberPage) {
        this.numberPage = numberPage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return numberPage == book.numberPage &&
                Objects.equals(author, book.author) &&
                Objects.equals(name, book.name);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", numberPage=" + numberPage +
                '}';
    }
}
