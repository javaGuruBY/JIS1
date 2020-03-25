package by.jrr.bean;

public class PrimeNumbers {
    private int sum = 2;
    private int countPrimeNumbers = 1;

    public void getCountPrimeNumbers() {
        for(int i = 3; i <= 500; i += 2) {
            if(isPrimeNumber(i) && thisNumberIsNotSeventeenAndSeventyOne(i)) {
                sum += i;
                countPrimeNumbers++;
                if(countPrimeNumbers == 50) {
                    System.out.println("sum = " + sum + " count = " + countPrimeNumbers);
                    return;
                }
            }
        }
    }

    private boolean thisNumberIsNotSeventeenAndSeventyOne(int number) {
        if(number != 17 && number != 71)
            return true;
        return false;
    }

    private boolean isPrimeNumber(int number) {
        if(number % 2 == 0)
            return false;
        for(int i = 3; i * i <= number; i += 2) {
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
