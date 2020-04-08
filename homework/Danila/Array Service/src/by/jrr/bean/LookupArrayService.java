package by.jrr.bean;

import java.util.Arrays;

public class LookupArrayService {
    public int findMax(int[] array) {
        return Arrays.stream(array)
                .max()
                .orElse(0);
    }

    public int findMin(int[] array) {
        return Arrays.stream(array)
                .min()
                .orElse(0);
    }

    public int indexOfMax(int[] array) {
        int maxNumber = findMax(array);

        for (int i = 0; i < array.length; i++) {
            if(array[i] == maxNumber) {
                return i + 1;
            }
        }
        return -1;
    }

    public int indexOfMin(int[] array) {
        int minNumber = findMin(array);

        for (int i = 0; i < array.length; i++) {
            if(array[i] == minNumber) {
                return i + 1;
            }
        }
        return -1;
    }

    public int indexOf(int[] array, int value) {
        for(int i = 0; i < array.length; i++) {
            if(array[i] == value) {
                return i + 1;
            }
        }
        return -1;
    }
}
