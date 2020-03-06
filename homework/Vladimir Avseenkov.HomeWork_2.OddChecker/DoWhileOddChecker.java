public class DoWhileOddChecker {

    public String checker () {
        String outputDo = "";
        int i = 0;
        do {
            if (i % 2 == 1) {
                outputDo += i + " ";
            }
            i++;
        } while (i <= 50);
        return outputDo;
    }
}
