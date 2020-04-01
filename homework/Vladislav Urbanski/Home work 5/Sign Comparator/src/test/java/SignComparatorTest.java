import main.java.service.SignComparator;

public class SignComparatorTest {

    public static void main(String[] args) {
        SignComparatorTest runTest = new SignComparatorTest();

        runTest.testExpectedResultGreaterZero();
        runTest.testExpectedResultLessZero();
        runTest.testExpectedResultZero();
    }


    SignComparator signComparator = new SignComparator();

    public void testExpectedResultGreaterZero() {
        String testDescription = "Should say that the number is greater than zero";

        String expectedResult = signComparator.getMore();
        String actualResult = signComparator.compare(5);

        tellMeTruth(expectedResult, actualResult, testDescription);
    }

    public void testExpectedResultLessZero() {
        String testDescription = "Should say that the number is less than zero";

        String expectedResult = signComparator.getLess();
        String actualResult = signComparator.compare(-7);

        tellMeTruth(expectedResult, actualResult, testDescription);
    }

    public void testExpectedResultZero() {
        String testDescription = "Should say that the number is zero";

        String expectedResult = signComparator.getEqualZero();
        String actualResult = signComparator.compare(0);

        tellMeTruth(expectedResult, actualResult, testDescription);
    }

    public void tellMeTruth(String expectedResult, String actualResult, String testDescription) {
        if(actualResult.equals(expectedResult)) {
            System.out.println(testDescription + " has passed!");
        } else {
            System.out.println(testDescription + " has failed!");
            System.out.println("Expected '" + expectedResult + "' but was '" + actualResult +"'");
        }
    }
}
