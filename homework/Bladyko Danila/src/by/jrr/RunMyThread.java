package by.jrr;

import by.jrr.bean.PrimeNumbers;

public class RunMyThread implements Runnable {
    @Override
    public void run() {
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.getCountPrimeNumbers();
    }
}
