package com.vladis1350.service;

import com.vladis1350.bean.Book;
import com.vladis1350.exception.ItemNotFoundException;
import com.vladis1350.message.ErrorExceptions;
import com.vladis1350.repository.Repository;

import java.util.*;

public class BookRepository<T extends Book> implements Repository<T> {

    Map<String, T> bookMap = new HashMap<>();

    @Override
    public List findAll() {
        return new ArrayList<>(bookMap.entrySet());
    }

    @Override
    public T findById(String id) throws ItemNotFoundException {
        if (!id.equals("")) {
            return bookMap.get(id);
        } else {
            throw new ItemNotFoundException(ErrorExceptions.ITEM_NOT_FOUND);
        }
    }

    @Override
    public void saveItem(T item) {
        bookMap.put(item.getId(), item);
    }

    @Override
    public void delete(String id) throws ItemNotFoundException {
        if(!id.equals("")) {
            bookMap.remove(id);
        } else {
            throw new ItemNotFoundException(ErrorExceptions.ITEM_NOT_FOUND);
        }
    }
}
