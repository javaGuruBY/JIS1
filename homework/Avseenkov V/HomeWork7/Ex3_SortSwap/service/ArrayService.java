package service;

import java.util.Arrays;
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

    public int[] sort(int[] array) {
        Arrays.sort(array);
        return array;
    }

    public int[] swap(int[] array) {
        int temporaryInt;
        for (int inc = 0, dec = array.length-1; inc < (array.length / 2); inc++, dec--) {
            temporaryInt = array[inc];
            array[inc] = array[dec];
            array[dec] = temporaryInt;
        }
        return array;
    }
}
