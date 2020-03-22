package service;

import java.lang.reflect.Array;
import java.util.Random;

public class ArrayService {

    public int[] create(int size) {
        return new int[size];
    }

    public void fillRandomly(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " has index " + i + "; ");
        }
        System.out.println();
    }

    public int sum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public double avg(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        return (double) sum(array) / array.length;
    }
}
