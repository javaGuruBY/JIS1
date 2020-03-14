package com.company.bean;

import com.company.service.Library;
import com.company.service.Book;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("author", "name"));
        library.addBook(new Book("author1", "name1"));
        library.addBook(new Book("author2", "name2"));
        library.addBook(new Book("author2", "name2_2"));
        library.addBook(new Book("author3", "name3"));

        //library.returnAllProduct();
        //library.findBookByName("name2");
        library.removeBook("author1", "name1");
        library.removeBook("author", "name");
        library.removeBook("author2", "name2");
        System.out.println(library.toString());
        //library.returnAllProduct();
        ////library.returnBooksByAuthor("author2");
    }
}
