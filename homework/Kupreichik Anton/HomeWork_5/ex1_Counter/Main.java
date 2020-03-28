package com.company;
import com.company.bean.Counter;
import com.company.service.CounterService;

public class Main {

    public static void main(String[] args) {
        Counter counter = new Counter();
        CounterService counterService = new CounterService();
        counter.getValue(); //Equals to 0
        counter.getStep();  //Equals to 1
        counterService.increment();
        counter.getValue(); //Equals to 1
        counter.setStep(5);
        counterService.increment();
        counter.setStep(2);
        counterService.decrement();
        System.out.println(counter.getValue()) ;//Equals to 4
        System.out.println(counter.getStep());   //Equals to 2
    }
}
