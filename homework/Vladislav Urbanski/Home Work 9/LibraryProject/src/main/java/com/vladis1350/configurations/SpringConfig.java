package com.vladis1350.configurations;

import com.vladis1350.bean.Book;
import com.vladis1350.bean.Library;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:book.properties")
public class SpringConfig {

    @Bean
    public Book bookOne() {
        return new Book("War and Peace", "Leo Tolstoy");
    }

    @Bean
    public Book bookTwo() {
        return new Book("Anna Karenina", "Leo Tolstoy");
    }

    @Bean
    public Book bookThree() {
        return new Book("Captain's daughter", "Aleksandr Pushkin");
    }

    @Bean
    public Library library() {
        return new Library();
    }
}
