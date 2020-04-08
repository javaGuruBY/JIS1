package by.jrr.bean;

import java.util.Arrays;

public class ArrayService {

    public int[] create(int size) {
        int[] array = new int[size];
        return array;
    }

    public void fillRandomly(int[] array) {
        for (int i : array) {
            i = (int) (Math.random() * 99 + 1);
        }
    }

    public void printArray(int[] array) {
        Arrays.stream(array)
                .forEach(i -> System.out.println(i));
    }

    public int sum(int[] array) {
        return Arrays.stream(array).sum();
    }

    public double avg(int[] array) {
        return (double) sum(array) / array.length;
    }

    public void sort(int[] array) {
        Arrays.sort(array);
    }

    public void swap(int[] array) {
        int middle = array.length / 2;
        for(int i = 0; i < middle; i++) {
            swapElements(array, i);
        }
    }

    private void swapElements(int[] array, int index) {
        int firstNumber = array[index];
        array[index] = array[array.length - index - 1];
        array[array.length - index - 1] = firstNumber;
    }
}
