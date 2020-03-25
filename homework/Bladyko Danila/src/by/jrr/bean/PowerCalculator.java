package by.jrr.bean;

public class PowerCalculator {
    public long exponentiation(long base, long power) {
        long initialBase = base;
        for(int i = 1; i < power; i++) {
            base *= initialBase;
        }
        return base;
    }
}
