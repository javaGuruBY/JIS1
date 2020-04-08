package by.jrr.service;

public class NumberService {
    public int rangeSum(int firstNumber, int secondNumber) {
        if(firstNumber > secondNumber) {
            int copyFirstNumber = secondNumber;
            secondNumber = firstNumber;
            firstNumber = copyFirstNumber;
        }

        int sum = 0;

        for(int i = firstNumber; i <= secondNumber; i++) {
            sum += i;
        }
        return sum;
    }

    public int rangeEventCount(int firstNumber, int secondNumber) {
        int count = 0;
        if(firstNumber > secondNumber) {
            int copyFirstNumber = secondNumber;
            secondNumber = firstNumber;
            firstNumber = copyFirstNumber;
        }

        for(int i = firstNumber; i <= secondNumber; i++) {
            if(i % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
