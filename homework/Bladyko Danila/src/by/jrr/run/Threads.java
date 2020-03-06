package by.jrr.run;

public class Threads {
    public static void main(String[] args) {
        Thread thread = new Thread(new RunProgram());
        thread.start();
    }
}