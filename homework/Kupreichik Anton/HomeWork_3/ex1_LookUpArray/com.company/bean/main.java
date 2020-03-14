package com.company.bean;

import com.company.service.LookupArrayService;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[10];
        LookupArrayService lookupArrayService = new LookupArrayService();
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt();
        }


        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i +"] = " + array[i]);
        }

        System.out.println("lookupArrayService.findMax(array) = " + lookupArrayService.findMax(array));
        System.out.println("lookupArrayService.findMin(array) = " + lookupArrayService.findMin(array));
        System.out.println("lookupArrayService.indexOf(array, lookupArrayService.findMax(array)) = " + lookupArrayService.indexOf(array, lookupArrayService.findMax(array)));
        System.out.println("lookupArrayService.indexOfMax(array) = " + lookupArrayService.indexOfMax(array));
        System.out.println("lookupArrayService.indexOfMin(array) = " + lookupArrayService.indexOfMin(array));
    }
}
