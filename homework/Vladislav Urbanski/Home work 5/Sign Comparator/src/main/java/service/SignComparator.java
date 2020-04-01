package main.java.service;

public class SignComparator {

    private final String more = "Number is positive";
    private final String less = "Number is negative";
    private final String equalZero = "Number is equal to zero";

    public String compare(int number) {
        if(number > 0 ) {
            return more;
        } else if(number < 0){
            return less;
        } else return equalZero;
    }

    public String getMore() {
        return more;
    }

    public String getLess() {
        return less;
    }

    public String getEqualZero() {
        return equalZero;
    }
}
