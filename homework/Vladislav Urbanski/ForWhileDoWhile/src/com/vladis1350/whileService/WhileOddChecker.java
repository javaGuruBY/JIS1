package com.vladis1350.whileService;

public class WhileOddChecker implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread started: " + Thread.currentThread().getName() + "\n");
        outputOddNumberThroughWhile();
        System.out.println("Thread ended: " + Thread.currentThread().getName() + "\n");
    }

    public void outputOddNumberThroughWhile(){
        int index = 0;
        while (index <= 50) {
            if (index % 2 == 0){
                System.out.println("through while: " + index);
            }
            index++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
