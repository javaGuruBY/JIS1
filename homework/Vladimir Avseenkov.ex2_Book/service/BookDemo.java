package service;

import bean.Book;
import test.BookTest;

public class BookDemo {
    public static void main(String[] args) throws Exception {
        Book book0 = new Book();
        book0.setAuthor("Robert C. Martin");
        book0.setTitle("Clean code");
        book0.setNumberOfPages(464);

        Book book1 = new Book();
        book1.setAuthor("Satan");
        book1.setTitle("Why heaven is the bad place to live after life");
        book1.setNumberOfPages(666);

        System.out.println(book0.toString() + "\n" + book1.toString());
        System.out.println(book0.getAuthor());
        System.out.println(book1.getTitle());

        BookTest test = new BookTest(1);
    }
}
