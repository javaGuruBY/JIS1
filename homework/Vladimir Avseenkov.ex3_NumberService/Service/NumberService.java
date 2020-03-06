package Service;

public class NumberService implements Runnable {
    int startOfRange, endOfRange;
    int totalNumers = 0;
    int totalEvenNumbers = 0;
    int summary = 0;
    String output = "";
    String outputEven = "";

    public NumberService(int startOfRange, int endOfRange) {
        this.startOfRange = startOfRange;
        this.endOfRange = endOfRange;
    }

    public void run() {
        calculate(startOfRange, endOfRange);
    }

    public void calculate(int startOfRange, int endOfRange) {
        if (startOfRange < endOfRange) {
            fromStartToEnd(startOfRange, endOfRange);
        } else {
            fromEndToStart(startOfRange, endOfRange);
        }
    }

    public void fromStartToEnd(int start, int end) {
        for (int i = start; i <= end; i++) {
            calculateSummary(i);
            if (ifEvenNumber(i)) {
                calculateEvenSummary(i);
            }
        }
        print();
    }

    public void fromEndToStart(int end, int start) {
        for (int i = end; i >= start; i--) {
            calculateSummary(i);
            if (ifEvenNumber(i)) {
                calculateEvenSummary(i);
            }
        }
        print();
    }

    public void calculateSummary(int i) {
        output += i + " + ";
        totalNumers++;
        summary += i;
    }

    public void calculateEvenSummary(int i) {
        outputEven += i + ", ";
        totalEvenNumbers++;
    }

    public boolean ifEvenNumber(int i) {
        return i % 2 == 0;
    }

    public void print() {
        System.out.println(output + " = " + summary + "\n" + outputEven + " => " + totalEvenNumbers);
    }
}
