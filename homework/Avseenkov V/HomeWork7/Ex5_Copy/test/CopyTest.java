package Ex5_Copy.test;

import Ex5_Copy.service.Copy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CopyTest {
    Copy copy = new Copy();

    public void run() throws Exception {
        shouldReturnArrayFrom1to5Index();
    }

    void shouldReturnArrayFrom1to5Index() throws Exception {
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] expected = {1, 2, 3, 4, 5};
        int[] actual = copy.copyInRange(array, 1, 5);
        assertEqualsArrays(expected, actual);
    }

    void assertEqualsArrays(int[] expected, int[] actual) throws Exception {
        if (Arrays.equals(expected, actual)) {
            System.out.println("\nTest passed");
        } else {
            throw new Exception("\nTest FAILED");
        }
    }
}
