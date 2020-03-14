package by.jrr.bean;

import java.util.Objects;

public class Book {
    String author;
    String nameBook;

    public Book() {
    }

    public Book(String author, String nameBook) {
        this.author = author;
        this.nameBook = nameBook;
    }

    public String getAuthorBook() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) &&
                Objects.equals(nameBook, book.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, nameBook);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", nameBook='" + nameBook + '\'' +
                '}';
    }
}
