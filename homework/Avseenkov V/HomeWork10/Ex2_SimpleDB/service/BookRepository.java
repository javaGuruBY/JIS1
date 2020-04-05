package service;

import bean.Book;
import exception.ItemNotFoundException;
import intefaces.Repository;
import stat.Messages;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookRepository<T extends Book> implements Repository<T> {

    Map<Long, T> bookList = new HashMap<>();

    @Override
    public List findAll() {
        return new ArrayList<>(bookList.entrySet());
    }

    @Override
    public T findById(long id) throws ItemNotFoundException {
        if (!(bookList.get(id) == null)) {
            return bookList.get(id);
        } else {
            throw new ItemNotFoundException(Messages.ITEM_NOT_FOUND);
        }
    }

    @Override
    public void save(T item) {
        bookList.put(item.getId(), item);
        System.out.println(item.getName() + " saved");

    }

    @Override
    public void delete(long id) throws ItemNotFoundException {
        if (!(bookList.get(id) == null)) {
            bookList.remove(id);
        } else {
            throw new ItemNotFoundException(Messages.ITEM_NOT_FOUND);
        }
    }
}
