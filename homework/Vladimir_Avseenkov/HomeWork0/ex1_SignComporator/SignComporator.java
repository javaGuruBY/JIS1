package Vladimir_Avseenkov.HomeWork0.ex1_SignComporator;

public class SignComporator {
    final String negative = "Number is negative";
    final String positive = "Number is Positive";
    final String zero = "Number is equals zero";

    public String compare(int number) {
        if (number < 0) {
            return negative;
        } else if (number > 0) {
            return positive;
        } else if (number == 0) {
            return zero;
        }
    }
}
