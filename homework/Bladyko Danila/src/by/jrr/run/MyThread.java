package by.jrr.run;

public class MyThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new RunMyThread());
        thread.start();
    }
}
