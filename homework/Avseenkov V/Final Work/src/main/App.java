package main;

import thread.MainThread;

public class App {
    public static void main(String[] args) {
        Thread thread = new Thread(new MainThread());
        thread.start();
    }
}
