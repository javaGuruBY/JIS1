package by.jrr.bean;

public class WhileOddChecker {
    public void WhileOddChecker() {
        int i = 0;
        while (i <= 50) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}
