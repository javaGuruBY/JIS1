package by.jrr.run;

import by.jrr.bean.DoWhileOddChecker;
import by.jrr.bean.ForOddChecker;
import by.jrr.bean.WhileOddChecker;

public class RunProgram implements Runnable {
    @Override
    public void run() {
        ForOddChecker forOddChecker = new ForOddChecker();
        WhileOddChecker whileOddChecker = new WhileOddChecker();
        DoWhileOddChecker doWhileOddChecker = new DoWhileOddChecker();

        forOddChecker.forOddChecker();
        System.out.println();
        whileOddChecker.WhileOddChecker();
        System.out.println();
        doWhileOddChecker.doWhileOddChecker();
    }
}
