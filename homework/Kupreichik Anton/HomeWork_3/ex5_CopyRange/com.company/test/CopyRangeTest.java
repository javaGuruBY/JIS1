package com.company.test;
import com.company.service.CopyRangeService;

import java.sql.Array;
import java.util.Arrays;

public class CopyRangeTest {

    CopyRangeService copyRangeService = new CopyRangeService();

    public void testShouldReturnNewArray() throws Exception {
        int[] array = {1,2,3,4,5};
        int[] expectedResult = copyRangeService.copyInRange(array, 1, 4 );
        int[] actualResult = {2,3,4,5};

        assertEqualsArray(expectedResult, actualResult, "testShouldReturnNewArray");
    }

    public void testShouldReturnNullWhenLeftBoardMoreThenRigthBoard() throws Exception {
        int[] array = {1,2,3,4,5};
        int[] expectedResult = copyRangeService.copyInRange(array, 3, 1 );
        int[] actualResult = {0};

        assertEqualsArray(expectedResult, actualResult, "testShouldReturnNullWhenLeftBoardMoreThenRigthBoard");
    }

    public void testShouldReturnNullWhenRigthBoardMoreThenLengthOfArray() throws Exception {
        int[] array = {1,2,3,4,5};
        int[] expectedResult = copyRangeService.copyInRange(array, 1, 7 );
        int[] actualResult = {0};

        assertEqualsArray(expectedResult, actualResult, "testShouldReturnNullWhenLeftBoardMoreThenRigthBoard");
    }


    private void assertEqualsArray(int[] expected, int[] actual, String description) throws Exception {
        if (!Arrays.equals(expected,actual)) {
            throw new Exception(description + " has failed! \n"+
                    "Expected '" + expected + "' but was '" + actual + "'");
        } else {
            System.out.println(description + " has passed!");
        }
    }
}
