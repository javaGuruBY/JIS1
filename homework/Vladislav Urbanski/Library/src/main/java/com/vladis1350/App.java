package com.vladis1350;

import com.vladis1350.bean.Book;
import com.vladis1350.factory.BookFactory;
import com.vladis1350.services.Library;


public class App {

    public static void main(String[] args) {
        Library library = new Library();
        Book book = new Book("interesting book 4", "cool author 4");
        library.addBook(book);

        library.addAllBook(BookFactory.createListProducts(5));

        library.getListBook().stream().forEach(System.out::println);
        System.out.println("\n");

        library.findByAuthor("cool author 4").stream().forEach(System.out::println);
        library.findByName("interesting book 2");
        System.out.println("\n");

        library.removeBook(library.getListBook().get(3));

        library.getListBook().stream().forEach(System.out::println);
    }
}
