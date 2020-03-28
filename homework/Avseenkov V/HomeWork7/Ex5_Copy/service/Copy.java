package Ex5_Copy.service;

public class Copy {

    public int[] copyInRange(int[] in, int leftBound, int rightBound) {
        int arrayLenght = 0;
        int index = 0;
        if (leftBound < rightBound) {
            arrayLenght = rightBound - leftBound + 1;
        } else if (leftBound > rightBound) {
            arrayLenght = leftBound - rightBound + 1;
        }
        int[] newArray = new int[arrayLenght];
        for (int i = leftBound; i <= rightBound; i++) {
            newArray[index] = in[i];
            index++;
        }
        return newArray;
    }

    public void printArray(int[] array){
        for (int value : array) {
            System.out.print(value + ", ");
        }
    }
}
