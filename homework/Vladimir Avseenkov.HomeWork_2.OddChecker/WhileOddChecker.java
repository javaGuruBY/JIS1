public class WhileOddChecker {

    public String checker () {
        int i = 0;
        String outputWhile = "";
        while (i < 51) {
            if (i % 2 == 1) {
                outputWhile += i + " ";
            }
            i++;
        }
        return outputWhile;
    }
}
