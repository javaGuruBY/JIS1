package com.vladis1350;

import com.vladis1350.doWhileService.DoWhileOddChecker;
import com.vladis1350.forService.ForOddChecker;
import com.vladis1350.whileService.WhileOddChecker;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        Thread threadForOddChecker = new Thread(new ForOddChecker(), "threadForOddChecker");
        Thread threadWhileOddChecker = new Thread(new WhileOddChecker(), "threadWhileOddChecker");
        Thread threadDoWhileOddChecker = new Thread(new DoWhileOddChecker(), "threadDoWhileOddChecker");
        threadForOddChecker.start();
        threadForOddChecker.join();

        threadWhileOddChecker.start();
        threadWhileOddChecker.join();

        threadDoWhileOddChecker.start();
    }
}
