package Ex5_Copy;

import Ex5_Copy.service.Copy;
import Ex5_Copy.test.CopyTest;

public class app {
    public static void main(String[] args) throws Exception {
        Copy copy = new Copy();
        CopyTest test = new CopyTest();
        int[] arrayBefore = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrayAfter = copy.copyInRange(arrayBefore, 1, 3);
        copy.printArray(arrayAfter);

        test.run();
    }
}
