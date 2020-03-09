package com.vladis1350.service;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LookupArrayService {

    public LookupArrayService() {
    }

    public String arrayToString(int[] array) {
        String result = "";
        for (int element : array) {
            result += element + ", ";
        }
        return result.substring(0, result.length() - 2);
    }

    public int findMax(int[] array) {
        return Arrays.stream(array).max().orElse(0);
    }

    public int findMin(int[] array) {
        return Arrays.stream(array).min().orElse(0);
    }

    public int indexOfMax(int[] array) {
        int maxElement = findMax(array);
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] == maxElement) {
                return i;
            }
        }
        return -1;
    }

    public int indexOfMin(int[] array) {
        int minElement = findMin(array);
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] == minElement) {
                return i;
            }
        }
        return -1;
    }

    public int indexOf(int[] array, int value) {
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
