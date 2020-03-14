package by.jrr.counter;

public class Counter {
    private int value;
    private int step;
    private int firstValue;
    private int firstStep;

    public Counter() {
    }

    public Counter(int value, int step) {
        this.firstValue = value;
        this.firstStep = step;
        this.value = value;
        this.step = step;
    }

    public void increment() {
        if(this.value + this.step <= 100) {
            this.value += this.step;
        }
    }

    public void decrement() {
        if(this.value - this.step >= 0) {
            this.value -= this.step;
        }
    }

    public void reset() {
        this.value = this.firstValue;
        this.step = this.firstStep;
    }

    public void setValue(int value) {
        if(value >= 0 && value <= 100)
            this.step = value;
    }

    public void setStep(int step) {
        if(step >= 1 && step <= 10)
            this.step = step;
    }

    public int getStep() {
        return this.step;
    }

    public int getValue() {
        return this.value;
    }
}
