package com.company.service;

public class CopyRangeService implements Runnable{

    public void run(){
    int[] array = {1,2,3,4,5,6,7,8,9,0};
    copyInRange(array, 0 , 3);
    }
    public CopyRangeService() { };

    public int[] copyInRange(int[] in, int leftBound, int rightBound) {
        int[] nullArray = {0};
        int lengthOfArray = in.length;
        if(leftBound > rightBound){
            System.out.println("Неверные данные");
            return nullArray;
        }
        if (lengthOfArray < rightBound){
            System.out.println("Неверные данные");
            return nullArray;
        }
        int numbersOfNewArray = rightBound - leftBound + 1;
        int[] newArray = new int[numbersOfNewArray];
        while (leftBound - 1 != rightBound) {
            for(int i =0; i < numbersOfNewArray; i++) {
                newArray[i] = in[leftBound];
                leftBound++;
            }
        }
        for (int i=0; i<newArray.length; i++) {
            System.out.print(newArray[i]+" ");
        }
        return newArray;
    }

}
