package com.vladis1350.service;

import com.vladis1350.bean.Book;
import com.vladis1350.exception.ItemNotFoundException;
import com.vladis1350.repository.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRepository implements Repository {

    private Repository repository;
    Map<String, Book> bookMap = new HashMap<>();


    public BookRepository() {

    }

    @Override
    public List findAll() {
        return null;
    }

    @Override
    public Object findById(String id) throws ItemNotFoundException {
        return null;
    }

    @Override
    public void saveItem(Object item) {

    }

    @Override
    public void delete(String id) throws ItemNotFoundException {

    }
}
