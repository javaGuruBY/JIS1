package com.vladis1350.factory;

import com.vladis1350.bean.Book;

import java.util.ArrayList;
import java.util.List;

public class BookFactory {

    static int count = 0;

    public static List<Book> createListProducts(int count) {
        List<Book> productList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            productList.add(getNewProduct());
        }
        return productList;
    }

    public static Book getNewProduct() {
        count++;
        return new Book("interesting book " + count, "cool author " + count);
    }

}
