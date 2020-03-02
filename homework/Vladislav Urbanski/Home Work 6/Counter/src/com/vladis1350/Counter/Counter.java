package com.vladis1350.Counter;

public class Counter {
    private int value;
    private int step;

    public Counter() {
        this.value = 0;
        this.step = 1;
    }

    public Counter(int value, int step) {
        this.value = value;
        this.step = step;
    }

    public void increment() {
        if ((getStep() + getValue()) <= 100) {
            setValue(getValue()+getStep());
        }
    }

    public void decrement(){
        if ((getValue() - getStep()) > 0) {
            setValue(getValue() - getStep());
        }
    }

    public void reset() {
        this.value = 0;
        this.step = 1;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value >= 0 && value <= 100) {
            this.value = value;
        }
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        if (step >=1 && step <= 10) {
            this.step = step;
        }
    }
}
