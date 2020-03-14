package com.company;
import com.company.test.CopyRangeTest;

public class CopyRangeTestRunner {
    public static void main(String[] args) throws Exception {
        CopyRangeTest copyRangeTest = new CopyRangeTest();

        copyRangeTest.testShouldReturnNewArray();
        copyRangeTest.testShouldReturnNullWhenRigthBoardMoreThenLengthOfArray();
        copyRangeTest.testShouldReturnNullWhenLeftBoardMoreThenRigthBoard();
    }
}
