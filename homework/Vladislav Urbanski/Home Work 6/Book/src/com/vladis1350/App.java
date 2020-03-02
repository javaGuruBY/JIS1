package com.vladis1350;

import com.vladis1350.bean.Book;

public class App {
    public static void main(String[] args) {
        Book book = new Book("Пушкин", "У лукоморья дуб зеленый", 3);
        Book book2 = new Book("Пушкин", "У лукоморья дуб зеленый", 3);

        System.out.println(book.equals(book2)); //true

        System.out.println(book.toString());
        book.setAuthor("Маяковский");
        book.setName("Что такое хорошо и что такое плохо?");
        book.setNumberPage(285);

        System.out.println("Author: " + book.getAuthor() + "; Name Book: " + book.getName() + "; " +
                "Number pages: " + book.getNumberPage());

        System.out.println(book.equals(book2)); // false

    }
}
