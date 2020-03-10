package Ex1_LookUpArrayService.Service;

public class LookupArrayService {
    int min = 0;
    int max = 0;
    int indexOfMax = 0;
    int indexOfMin = 0;
    int index;

    public int findMax(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        for (int value : array) {
            if (max <= value) {
                max = value;
            }
        }
        return max;
    }

    public int findMin(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        for (int value : array) {
            if (min >= value) {
                min = value;
            }
        }
        return min;
    }

    public int indexOfMax (int[] array) {
        if (array.length == 0) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (max <= array[i]) {
                max = array[i];
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }

    public int indexOfMin (int[] array) {
        if (array.length == 0) {
            return 0;
        }
        for (int i = 0; i < array.length; i++) {
            if (min >= array[i]) {
                min = array[i];
                indexOfMin = i;
            }
        }
        return indexOfMin;
    }

    public int indexOf (int[] array, int value) {
        if (array.length == 0) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                return index = i;
            }
        }
        return index;
    }
}
