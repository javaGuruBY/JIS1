package com.vladis1350.service;

import com.vladis1350.bean.EntityBean;
import com.vladis1350.exception.ItemNotFoundException;
import com.vladis1350.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class BookAbstrRepository<T extends EntityBean> implements BookRepository<T> {

    private Map<Long, T> mapList = new HashMap<>();

    @Override
    public List<T> findAll() {
        return mapList.values().stream().collect(Collectors.toList());
    }

    @Override
    public T findById(Long id) throws ItemNotFoundException {
        if(mapList.get(id) == null) {
            throw new ItemNotFoundException("Key not found!");
        }
        return mapList.get(id);
    }

    @Override
    public void save(T item) {
        mapList.put(item.getId(), item);
    }

    @Override
    public void delete(Long id) throws ItemNotFoundException {
        if(mapList.remove(id) == null) {
            throw new ItemNotFoundException("Key not found!");
        }
    }

}
