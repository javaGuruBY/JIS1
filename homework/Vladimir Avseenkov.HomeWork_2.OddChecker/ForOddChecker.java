public class ForOddChecker {

    public String checker() {
        String outputFori = "";
        for (int i = 0; i <= 50 ; i++) {
            if (i % 2 == 1) {
                outputFori += i + " ";
             }
        }
        return outputFori;
    }
}
