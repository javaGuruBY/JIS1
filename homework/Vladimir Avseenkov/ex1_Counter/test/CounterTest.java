package ex1_Counter.test;

import ex1_Counter.bean.Counter;

public class CounterTest {
    public static void main(String[] args) {
        Counter counter = new Counter();
        System.out.println("Value = " + counter.getValue());
        System.out.println("Step = " + counter.getStep());

        counter.increment();

        System.out.println("Value = " + counter.getValue());

        counter.setStep(5);
        counter.increment();
        counter.setStep(2);
        counter.decrement();

        System.out.println("Value = " + counter.getValue());
        System.out.println("Step = " + counter.getStep());

        counter.reset();
        counter.setStep(10);
        System.out.println(counter.toString());
        counter.decrement();
        System.out.println(counter.toString());

    }

}
