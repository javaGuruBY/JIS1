package com.company.service;

public class DoWhileOddChecker {
    private int number;
    public void tableOutput(){
        do{
            System.out.print(number + "->");
            number++;
        }while(number <= 50);
    }
}
