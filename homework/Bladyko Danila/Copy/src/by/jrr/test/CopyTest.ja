package by.jrr.test;

import by.jrr.bean.Copy;

import java.util.Arrays;

public class CopyTest {
    Copy copy;

    public void testShouldCopyArray() {
        copy = new Copy();

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] newArray = copy.copyInRange(array, 1, 5);
        System.out.println(Arrays.toString(newArray));

        newArray = copy.copyInRange(array, 5, 10);
        System.out.println(Arrays.toString(newArray));
    }
}
