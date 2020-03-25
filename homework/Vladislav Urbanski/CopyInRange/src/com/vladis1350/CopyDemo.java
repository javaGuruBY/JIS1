package com.vladis1350;

import com.vladis1350.service.Copy;
import com.vladis1350.tests.CopyTest;

import java.util.Arrays;

public class CopyDemo {
    public static void main(String[] args) throws Exception {
        CopyTest copyTest = new CopyTest();
        Copy copy = new Copy();
        int[] array = {6, 96, 36, 56, 26, 16, 86, 46, 66, 76};
        int[] result = copy.copyInRange(array, 40, 80);
        System.out.println(Arrays.toString(result));


        copyTest.testShouldReturnArrayInGivenRange();


    }
}
