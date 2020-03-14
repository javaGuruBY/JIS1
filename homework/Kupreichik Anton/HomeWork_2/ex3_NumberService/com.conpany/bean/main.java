package com.company.bean;


import com.company.service.NumberService;

public class Main {

    public static void main(String[] args) {
        Thread thread = new Thread(new NumberService());
        thread.start();
    }
}
