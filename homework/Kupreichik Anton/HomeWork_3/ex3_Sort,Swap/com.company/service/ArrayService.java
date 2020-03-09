package com.company.service;
import java.util.Arrays;
import java.util.Random;

public class ArrayService implements Runnable {

    public int[] array;

    public ArrayService() { };

    public void run(){
        create(10);
        fillRandomly(array);
        printArray(array);
        System.out.println("arrayService.sum(arrayService.array) = " + sum(array));
        System.out.println("arrayService.avg(arrayService.array) = " + avg(array));
        sort(array);
        printArray(array);
        swap(array);
        System.out.println("\n");
        printArray(array);
    }

    public int[] create(int size) {
        array = new int[size];
        return array;
    }

    public void fillRandomly(int[] array) {
        Random random = new Random();
        for (int i =0 ; i < array.length ; i++) {
            array[i] = random.nextInt(99 + 1);
        }
    }

    public void printArray(int[] array) {
        for(int i =0; i < array.length ; i ++) {
            System.out.print(array[i] + " ");
        }
    }

    public int sum(int[] array) {
        int sum =0;
        for(int i =0; i < array.length ; i ++) {
            sum += array[i];
        }
        return sum;
    }

    public double avg(int[] array) {
        int avg = 0;
        for(int i =0; i < array.length ; i ++) {
            avg += array[i];
        }
        avg = avg / array.length;
        return avg;
    }

    public int[] sort(int[] array){
       Arrays.sort(array);
       return array;
}

    public int[] swap(int[] array){
        for (int i = 0, j = array.length - 1; i < array.length / 2; i++, j--)
        {
            int tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
        return array;
    }
}
