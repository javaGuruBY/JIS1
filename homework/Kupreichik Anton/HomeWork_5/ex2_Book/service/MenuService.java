package com.company.service;

import com.company.bean.Book;

import java.util.Scanner;

public class MenuService {
    static Scanner in = new Scanner(System.in);
    static Book[] book = new Book[1];

    static int numberOfBooks, numberOfPages;
    static String name, author;

    static public void setNumbersOfBooks(){
        System.out.println("Какое кол-тво книг вы желаете ввести?");
        numberOfBooks = in.nextInt();
        book = new Book[numberOfBooks + 1];
    }

    public static void enterData(){
        for (int i = 0; i < numberOfBooks; i += 1) {
            book[i] = new Book(i);
            System.out.println("Введите название для книги");
            name = in.nextLine();
            name = in.nextLine();
            book[i].setName(name);
            System.out.println("Введите автора для книги");
            author = in.nextLine();
            book[i].setAuthor(author);
            System.out.println("Введите кол-тво страниц для книги");
            numberOfPages = in.nextInt();
            book[i].setNumberOfPages(numberOfPages);
        }
    }

    public static void returnBooks(){
        System.out.println("\n\nВведенные данные:");
        for (int i = 0; i < numberOfBooks; i++) {
            System.out.println("\nАвтор: " + book[i].getAuthor());
            System.out.println("Название: " + book[i].getName());
            System.out.println("Количество страниц: " + book[i].getNumberOfPages());
        }
    }
}
