package com.company.bean;
import com.company.service.ArrayService;

public class Main {

    public static void main(String[] args) {
        Thread thread = new Thread(new ArrayService());
        thread.start();
    }
}
