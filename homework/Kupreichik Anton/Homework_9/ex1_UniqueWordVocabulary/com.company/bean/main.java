package com.company.bean;
import com.company.service.UniqueWordVocabulary;

public class Main {

    public static void main(String[] args) {
    Thread thread = new Thread(new UniqueWordVocabulary());
    thread.start();
    }
}
