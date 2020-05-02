package database;

import bean.Product;

import java.util.LinkedList;
import java.util.List;

public class InMemoryDataBase {
    public static final List<Product> dataBase = new LinkedList<>();

    private InMemoryDataBase() {}
}
