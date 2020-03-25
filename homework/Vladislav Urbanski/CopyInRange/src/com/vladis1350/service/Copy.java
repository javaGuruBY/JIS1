package com.vladis1350.service;

public class Copy {

    public int[] copyInRange(int[] in, int leftBound, int rightBound) {
        int[] resultInt;
        int index = 0;
        int amountElements = 0;
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= leftBound && in[i] <= rightBound) {
                amountElements++;
            }
        }
        resultInt = new int[amountElements];
        for (int i = 0; i < in.length; i++) {
            if (in[i] >= leftBound && in[i] <= rightBound) {
                resultInt[index] = in[i];
                index++;
            }
        }
        return resultInt;
    }

}
