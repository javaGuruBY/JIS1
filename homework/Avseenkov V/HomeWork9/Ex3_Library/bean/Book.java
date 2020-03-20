package bean;

import java.io.Serializable;
import java.util.Objects;

public class Book implements Serializable {

    private String Name = "";
    private String Author = "";

    public Book(String author, String name) {
        Name = name;
        Author = author;
    }

    private Book() {
    }

    public String getName() {
        return Name;
    }

    public String getAuthor() {
        return Author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Name.equals(book.Name) &&
                Author.equals(book.Author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Author);
    }

    @Override
    public String toString() {
        return "Book" +
                "Name='" + Name + '\'' +
                ", Author='" + Author;
    }

}
