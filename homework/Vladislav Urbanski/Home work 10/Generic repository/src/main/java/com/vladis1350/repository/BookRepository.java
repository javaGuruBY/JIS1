package com.vladis1350.repository;

import com.vladis1350.bean.EntityBean;
import com.vladis1350.exception.ItemNotFoundException;

import java.util.List;

public interface BookRepository<T extends EntityBean> {

    List<T> findAll();
    T findById(Long id) throws ItemNotFoundException;
    void save(T item);
    void delete(Long id) throws ItemNotFoundException;
}
