package by.jrr.bean;

public class Copy {
    public int[] copyInRange(int[] in, int leftBound, int rightBound) {
        int[] array = new int[rightBound - leftBound + 1];
        leftBound--;

        for(int i = leftBound; i < rightBound; i++) {
            array[i - leftBound] = in[i];
        }
        return array;
    }
}
