package com.vladis1350.repository;

import com.vladis1350.exception.ItemNotFoundException;

import java.util.List;

public interface Repository <T> {
    List<T> findAll();
    T findById(String id) throws ItemNotFoundException;
    void saveItem(T item);
    void delete(String id) throws ItemNotFoundException;
}
