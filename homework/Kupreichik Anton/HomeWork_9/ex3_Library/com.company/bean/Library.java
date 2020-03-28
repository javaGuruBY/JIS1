package com.company.bean;

import com.company.bean.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    public Library() {    };

    public List<Object> library = new ArrayList<>();

    @Override
    public String toString() {
        return "Library{" +
                "library=" + library +
                '}';
    }
}
