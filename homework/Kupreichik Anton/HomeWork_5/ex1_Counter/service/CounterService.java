package com.company.service;

import com.company.bean.Counter;

public class CounterService {

    Counter counter = new Counter();

    public void increment()  // увеличить значение счетчика с учетом шага;
    {
        if((counter.getValue() + counter.getStep()) > 100) System.out.println("Значение больше 100");
        else counter.setValue(counter.getValue() + counter.getStep());
    }

    public void decrement() // уменьшить значение счетчика с учетом шага;
    {
        if((counter.getValue() - counter.getStep())  < 0) System.out.println("Значение меньше 0");
        else counter.setValue(counter.getValue() - counter.getStep());
    }

    public void reset() // сбросить значение и шаг счетчика в начальное состояние;
    {
        counter.setValue(0);
        counter.setStep(0);
    }
}
