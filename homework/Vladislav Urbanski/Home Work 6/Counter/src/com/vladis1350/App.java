package com.vladis1350;

import com.vladis1350.Counter.Counter;

public class App {
    public static void main(String[] args) {
        Counter counter = new Counter();

        System.out.println("counter.getValue() = " + counter.getValue());
        System.out.println("counter.getStep() = " + counter.getStep());

        counter.increment();
        System.out.println("\ncounter.getValue() = " + counter.getValue());
        System.out.println("counter.getStep() = " + counter.getStep());

        counter.setStep(5);
        counter.increment();
        System.out.println("\ncounter.getStep() = " + counter.getStep());
        System.out.println("counter.getValue() = " + counter.getValue());

        counter.setStep(2);
        counter.decrement();
        System.out.println("\ncounter.getStep() = " + counter.getStep());
        System.out.println("counter.getValue() = " + counter.getValue());
    }
}
