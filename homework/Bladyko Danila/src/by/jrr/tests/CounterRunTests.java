package by.jrr.tests;

public class CounterRunTests {
    public static void main(String[] args) throws Exception {
        CounterTest counterTest = new CounterTest();

        counterTest.testShouldWriteThreeAndFive();
        counterTest.testShouldWriteFourAndThree();
    }
}
