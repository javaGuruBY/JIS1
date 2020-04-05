package com.company.bean;

import com.company.bean.Book;

import java.util.ArrayList;
import java.util.List;

public class Library implements Serializible {
    public Library() {    };

    public List<Object> library = new ArrayList<>();

    @Override
    public String toString() {
        return "Library{" +
                "library=" + library +
                '}';
    }
        @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
