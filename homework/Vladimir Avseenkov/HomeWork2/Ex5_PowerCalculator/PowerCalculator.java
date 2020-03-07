package HomeWork2.Ex5_PowerCalculator;

public class PowerCalculator {


    public long powerCalculator(long number, long degree) {
        long result = number;
        for (int i = 1; i < degree; i++) {
            if (number < 0) {
                break;
            }
            result = result * number;
        }
        return result;
    }


}
