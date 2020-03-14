package HomeWork2.Ex5_PowerCalculator;

public class PowerCalculatorTest {

    PowerCalculator calc = new PowerCalculator();

    public void runner () throws Exception {
        shouldReturn4();
        shouldReturn27();
        shouldReturn134217728();
    }

    void shouldReturn4 () throws Exception {
        long expectedResult = 4;
        long actualResult = calc.powerCalculator(2,2);
        String description = "Test for 2^2 has";
        checker(expectedResult, actualResult, description);
    }

    void shouldReturn27() throws Exception {
        long expectedResult = 27;
        long actualResult = calc.powerCalculator(3,3);
        String description = "Test for 3^3 has";
        checker(expectedResult, actualResult, description);
    }

    void shouldReturn134217728() throws Exception {
        long expectedResult = 134217728;
        long actualResult = calc.powerCalculator(8,9);
        String description = "Test for 8^9 has";
        checker(expectedResult, actualResult, description);
    }

    void checker (long expected, long actual, String description) throws Exception {
        if (expected == actual) {
            System.out.println(description + " passed");
        } else {
            throw new Exception(description + " FAILED");
        }
    }
}
