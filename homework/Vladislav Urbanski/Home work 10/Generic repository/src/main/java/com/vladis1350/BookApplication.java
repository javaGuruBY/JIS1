package com.vladis1350;

import com.vladis1350.bean.Book;
import com.vladis1350.exception.ItemNotFoundException;
import com.vladis1350.service.RepositoryBook;

public class BookApplication {


    public static void main(String[] args) {
        RepositoryBook repository = new RepositoryBook();

        Book bookOne = new Book(1l,"Философия java", "Брюс Эккель", 786);
        Book bookTwo = new Book(2l,"Язык программирования Java", "Кен Арнольд", 616);

        repository.save(bookOne);
        repository.save(bookTwo);
        try {
            System.out.println(repository.findById(1l) + "\n" +
                                repository.findById(2l));

            repository.delete(3l);
        } catch (ItemNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(repository.findAll());

    }
}
