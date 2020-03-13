package com.company.bean;
import com.company.service.UniqueWordCounter;

public class Main {

    public static void main(String[] args) {
    Thread thread = new Thread(new UniqueWordCounter());
    thread.start();
    }
}
