public class Main {

    public static void main(String[] args) {
        ForOddChecker fori = new ForOddChecker();
        System.out.println("For i " + fori.checker());

        WhileOddChecker whileOddChecker = new WhileOddChecker();
        System.out.println("while " + whileOddChecker.checker());

        DoWhileOddChecker dowhile = new DoWhileOddChecker();
        System.out.println("do while " + dowhile.checker());
    }
}
