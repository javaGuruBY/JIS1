package by.jrr.thread;

import by.jrr.children.Cat;
import by.jrr.parents.Animal;

public class RunMyThread implements Runnable {
    @Override
    public void run() {
        Cat cat = new Cat();
        cat.voice();
    }
}
