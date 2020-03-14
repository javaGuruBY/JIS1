package com.company.service;

public class NumberService implements Runnable {
    private int sum = 0, numberOfEven = 0;

    public void run() {
        System.out.println("Сумма равна: " + this.rangeSum(3, 7));
        System.out.println("Сумма равна: " + this.rangeSum(7, 3));
        System.out.println("Сумма равна: " + this.rangeSum(7, 7));
        System.out.println("Кол-тво четных :" + this.rangeEvenCount(2, 10));
        System.out.println("Кол-тво четных :" + this.rangeEvenCount(10, 2));
        System.out.println("Кол-тво четных :" + this.rangeEvenCount(10, 10));

    }

    public int rangeSum(int start, int finish) {
        sum = 0;
        if (start == finish) {
            System.out.println("Числа одинаковые");
            sum = finish;
            return sum;
        }
        if (start < finish) {
            while (start != finish + 1) {
                sum += start;
                ++start;
            }
            return sum;
        } else {
            while (start != finish - 1) {
                sum += start;
                --start;
            }
            return sum;
        }
    }

    public int rangeEvenCount(int start, int finish) {
        numberOfEven = 0;
        if (start == finish) {
            System.out.println("Числа одинаковые");
            if (start % 2 == 0) {
                return numberOfEven + 1;
            }
            else return numberOfEven;
        }
        if (start < finish) while (start != finish + 1) {
            if (start % 2 == 0) {
                numberOfEven++;
            }
            ++start;
        }
        else {
            while (start != finish - 1) {
                if (start % 2 == 0) {
                    numberOfEven++;
                    --start;
                } else --start;
            }
        }
        return numberOfEven;
    }

    @Override
    public String toString() {
        return "NumberService{" +
                "sum=" + sum +
                ", numberOfEven=" + numberOfEven +
                '}';
    }
}
