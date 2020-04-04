import service.ArrayService;
import test.ArrayServiceTest;

public class ArrayServiceDemo {
    public static void main(String[] args) throws Exception {
        ArrayService arrayService = new ArrayService();
        int[] myArray = arrayService.create(5);

        arrayService.fillRandomly(myArray);
        System.out.println("Array before sort:");
        arrayService.printArray(myArray);

        arrayService.sort(myArray);
        System.out.println("\nArray after sort:");
        arrayService.printArray(myArray);

        arrayService.swap(myArray);
        System.out.println("\nArray after swap:");
        arrayService.printArray(myArray);
        System.out.println();

        System.out.println("Sum of " + myArray.length + " numbers is " + arrayService.sum(myArray));

        System.out.println("Avarage of " + myArray.length + " numbers is " + arrayService.avg(myArray));

        ArrayServiceTest test = new ArrayServiceTest();
        test.runTests();
    }
}
