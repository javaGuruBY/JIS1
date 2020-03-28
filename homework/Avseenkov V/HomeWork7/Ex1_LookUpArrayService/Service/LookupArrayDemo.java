package Ex1_LookUpArrayService.Service;

public class LookupArrayDemo {
    public static void main(String[] args) {
        LookupArrayService lookupArrayService = new LookupArrayService();
        int[] array0 = {1, 2, 3, 4, 5, 4, 3, 2, 0};
        int[] array1 = {10, 20, 30, 100, 1, -2, 600};
        int[] array2 = {123, 456, 789, 0, 1000};
        int[] emptyArray = new int[0];

        System.out.println("Max number is " + lookupArrayService.findMax(array0));
        System.out.println("It has index " + lookupArrayService.indexOfMax(array0));

        System.out.println("Min number is " + lookupArrayService.findMin(array1));
        System.out.println("It has index " + lookupArrayService.indexOfMin(array1));

        System.out.println("Index of number 789 is " + lookupArrayService.indexOf(array2, 789));

        System.out.println("Empty array.Should return 0. " + lookupArrayService.findMax(emptyArray));
        System.out.println("Empty array.Should return -1. " + lookupArrayService.indexOf(emptyArray, 333));
    }
}
