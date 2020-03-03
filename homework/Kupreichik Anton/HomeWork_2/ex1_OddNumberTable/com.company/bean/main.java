package com.company.bean;
import com.company.service.*;

public class Main {

    public static void main(String[] args) {
	    ForOddChecker forOddChecker = new ForOddChecker();
	    WhileOddChecker whileOddChecker = new WhileOddChecker();
	    DoWhileOddChecker doWhileOddChecker = new DoWhileOddChecker();
	    System.out.println("С помощью цикла for\n");
	    forOddChecker.tableOutput();
        System.out.println("\nС помощью цикла while\n");
	    whileOddChecker.tableOutput();
        System.out.println("\nС помощью цикла do,while\n");
	    doWhileOddChecker.tableOutput();
    }
}
