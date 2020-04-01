package com.company.bean;

public class Counter {

    private int value;  // текущее значение счетчика
    private int step;   //  шаг, с котором изменяется состояние счетчика

    public Counter() {
        this.value = 0;
        this.value = 1;
    }

    public void setValue(int value) {
        if(this.value < 100 || this.value > 0)
        this.value = value;
        else
            System.out.println("не в диапазоне");
    }

    public int getValue()
    {
        return this.value;
    }

    public void setStep(int step){
        if(this.step < 10 || this.step > 0)
        this.step = step;
    else
        System.out.println("не в диапазоне");

    }

    public int getStep() //
    {
        return this.step;
    }

}

