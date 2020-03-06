package by.jrr.bean;

public class DoWhileOddChecker {
    public void doWhileOddChecker() {
        int i = 0;
        do {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
        while(++i <= 50);
    }
}
