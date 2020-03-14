package com.company.service;

import java.util.HashMap;
import java.util.Map;

public class Library {

    Map<String, String> libraryMap = new HashMap<>();

    public Library(){} ;

    public void addBook(Book book) {
        libraryMap.put(book.getName(), book.getAuthor());
    }

    public void removeBook(String name, String author) {
        libraryMap.remove(name, author);
    }

    public void findBookByName(String name) {
        System.out.println(libraryMap.containsValue(name));
    }

    public boolean returnBooksByAuthorBool(String author){
       return libraryMap.keySet().stream().equals(author);
    }

    public void returnBooksByAuthor(String author){
        for (int i = 0; i < libraryMap.size(); i++) {
            if(returnBooksByAuthorBool(author)){
                libraryMap.keySet().stream().forEach(System.out::println);
            }
        }
    }

    public int returnSize(){
        return libraryMap.size();
    }



    public void returnAllProduct(){
        System.out.println("Название: "+ libraryMap.keySet() + " ");
        System.out.println("Автор: " + libraryMap.values() + " ");
    }

    @Override
    public String toString() {
        return "Library{" +
                "libraryMap=" + libraryMap +
                '}';
    }
}
