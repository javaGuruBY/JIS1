package com.vladis1350;

import com.vladis1350.bean.Book;
import com.vladis1350.service.BookRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        Map<String, Book> map = new HashMap<>();
        map.put("KOL", new Book("asdasd", "asdasd", "asd", 1));
        Map<String, Book> map1 = new HashMap<>();
        map.put("KOLs", new Book("asd as d", "asdasd", "asd", 1));
        Map<String, Book> map2 = new HashMap<>();
        map.put("KOLa", new Book("asd asd ", "asdasd", "asd", 1));
        Map<String, Book> map3 = new HashMap<>();
        map.put("KOLd", new Book("asdasd", "asdasd", "asd", 1));

        List<Map<String, Book>> list = new ArrayList<>();
        list.add(map);
        list.add(map1);
        list.add(map2);
        list.add(map3);
        BookRepository bookRepository = new BookRepository();
        List<Map<String, Book>> ll = bookRepository.findAll();
        System.out.println(ll);
    }
}
