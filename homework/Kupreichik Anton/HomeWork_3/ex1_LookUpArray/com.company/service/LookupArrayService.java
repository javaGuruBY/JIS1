package com.company.service;

public class LookupArrayService {
    private int max, min, indexOfMax, indexOfMin, indexOf;
    public LookupArrayService(){ };


    public int findMax(int[] array) {
        max = 0;
        if(array.length == 0)   return 0;
        for (int i = 0; i < array.length; i++) {
        if(max <= array[i]) max = array[i];
        }
        return max;
    }

    public int findMin(int[] array) {
        min = 0;
        if(array.length == 0)   return 0;
        for (int i = 0; i < array.length; i++) {
            if(min >= array[i]) min = array[i];
        }
        return min;
    }

    public int indexOfMax(int[] array) {
        max = 0;
        if(array.length == 0)   return -1;
        for (int i = 0; i < array.length; i++) {
            if(max <= array[i]) {
                max = array[i];
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }

    public int indexOfMin(int[] array) {
        min = 0;
        if(array.length == 0)   return -1;
        for (int i = 0; i < array.length; i++) {
            if(min >= array[i]) {
                min = array[i];
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }

    public int indexOf(int[] array, int value) {
        if(array.length == 0)   return -1;
        for (int i = 0; i < array.length; i++) {
            if(value == array[i]) {
                indexOf = i;
                break;
            }
        }
        return indexOf;
    }



}
