package com.vladis1350;

import com.vladis1350.bean.Book;
import com.vladis1350.exception.ItemNotFoundException;
import com.vladis1350.service.BookRepository;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {

    public static void main(String[] args) {
        BookRepository bookRepository = new BookRepository();
        Book bookOne = new Book("asdasd1", "asdasd", "asd", 11);
        Book bookTwo = new Book("asd as d", "asdasd", "asd", 12);
        Book bookThree = new Book("asd asd", "asdasd", "asd", 13);
        Book bookFour = new Book("asdasd", "asdasd", "asd", 14);

        bookRepository.saveItem(bookOne);
        bookRepository.saveItem(bookTwo);
        bookRepository.saveItem(bookThree);
        bookRepository.saveItem(bookFour);

        bookRepository.findAll().stream().forEach(System.out::println);
        try {
            System.out.println(bookRepository.findById("asd asd"));
            bookRepository.delete("asdasd");
        } catch (ItemNotFoundException e) {
            e.printStackTrace();
        }

        bookRepository.findAll().stream().forEach(System.out::println);
    }
}
