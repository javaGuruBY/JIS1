package intefaces;

import exception.ItemNotFoundException;

import java.util.List;

public interface Repository<T> {

    List<T> findAll();
    T findById(long id) throws ItemNotFoundException;
    void save(T item);
    void delete(long id) throws ItemNotFoundException;
}
