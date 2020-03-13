package com.vladis1350;

import com.vladis1350.bean.Book;
import com.vladis1350.bean.Library;
import com.vladis1350.configurations.SpringConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringConfig.class);

        Book bookOne = applicationContext.getBean("bookOne", Book.class);
        Book bookTwo = applicationContext.getBean("bookTwo", Book.class);
        Book bookThree = applicationContext.getBean("bookThree", Book.class);

       Library library = applicationContext.getBean("library", Library.class);
       library.addBook(bookOne);
       library.addBook(bookTwo);
       library.addBook(bookThree);

        System.out.println(library.findByName("Captain's daughter"));
        System.out.println(library.findByAuthor("Leo Tolstoy"));

        library.removeBook(bookTwo);
    }
}
