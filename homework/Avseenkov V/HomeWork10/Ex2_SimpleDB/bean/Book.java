package bean;

import java.io.Serializable;
import java.util.Objects;

public class Book implements Serializable {
    private long id;
    private static long idInc = 1;
    private String name;
    private String author;
    private int pagesCount;

    public Book() {
    }

    public Book(String name, String author, int pagesCount) {
        this.id = idInc++;
        this.name = name;
        this.author = author;
        this.pagesCount = pagesCount;
    }

    public long getId() {
        return id;
    }

    private void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    private void setAuthor(String author) {
        this.author = author;
    }

    public int getPagesCount() {
        return pagesCount;
    }

    private void setPagesCount(int pagesCount) {
        this.pagesCount = pagesCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pagesCount == book.pagesCount &&
                name.equals(book.name) &&
                author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, pagesCount);
    }

    @Override
    public String toString() {
        return "Book " +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", pagesCount=" + pagesCount +"\n";
    }
}
