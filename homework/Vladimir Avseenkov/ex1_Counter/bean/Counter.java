package ex1_Counter.bean;

public class Counter {
    private int value;
    private int step;

    public Counter() {
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
        if (step >= 0 && step <= 10) {
            this.step = step;
        }
    }

    public void increment() {
        int resultOfIncrement = value + step;
        if (resultOfIncrement <= 100) {
            value += step;
        }
    }

    public void decrement() {
        int resultOfDecrement = value - step;
        if (resultOfDecrement >= 0) {
            value -= step;
        }
    }

    public void reset() {
        this.setValue(0);
        this.setStep(1);
    }

    @Override
    public String toString() {
        return "Counter {" +
                "value=" + value +
                ", step=" + step +
                '}';
    }
}
