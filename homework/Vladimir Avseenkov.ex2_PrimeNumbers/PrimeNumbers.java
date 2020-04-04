public class PrimeNumbers {

    public static int summ;
    public static int count = 0;
    public static String output = "";


    public static void main(String[] args) {
        printCountAndSumm();
    }

    public static void printCountAndSumm() {

        for (int i = 2; i < 500; i++) {
            boolean simple = true;
            if (i == 17 || i == 71) {
                continue;
            }
            if (checkForEvenNumber(i)) {
                continue;
            }
            if (count >= 50) {
                break;
            }

            if (i == 2) {
                addToSimpleNumbers(i);
            } else {
                numberBruteForce(i);
            }

        }
        System.out.println("Summ = " + summ + "; Count = " + count + "\n" + output);
    }

    public static void addToSimpleNumbers(int i) {
        summ += i;
        count++;
        output += i + " ";
    }

    public static boolean checkForEvenNumber (int i) {
        if (i > 2 && i % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void numberBruteForce (int i) {
        boolean simple = true;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                simple = false;
            }
        }
        if (simple) {
            addToSimpleNumbers(i);
        }
    }
}
