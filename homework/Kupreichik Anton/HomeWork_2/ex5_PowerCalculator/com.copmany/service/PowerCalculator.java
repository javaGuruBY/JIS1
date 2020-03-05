package com.company.service;

public class PowerCalculator  implements  Runnable{
    private int number, degree, total = 1;


    public PowerCalculator() { };

    public void run(){
        System.out.println("this.calculateDegree(2,3) = " + this.calculateDegree(2, 3));
        System.out.println("this.calculateDegree(5,2) = " + this.calculateDegree(5, 2));
        System.out.println("this.calculateDegree(3,3) = " + this.calculateDegree(3, 3));
        System.out.println("this.calculateDegree(5,3) = " + this.calculateDegree(5, 3));
        System.out.println("this.calculateDegree(7,2) = " + this.calculateDegree(7, 2));

    }

    public int calculateDegree(int number, int degree){
        total = 1;
        for(int i =0; i < degree; i++){
            total*=number;
        }
        return total;
    }

}
