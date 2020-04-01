package com.vladis1350;

public class AppTest {
    public static void main(String[] args) {
        Thread thread = new Thread(new UniqueWordCounterTest());
        thread.start();
    }
}
