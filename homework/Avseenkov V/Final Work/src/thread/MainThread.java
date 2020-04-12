package thread;

import userInterface.ConsoleUI;

public class MainThread implements Runnable{
    @Override
    public void run() {
        ConsoleUI start = new ConsoleUI();
        start.startConsoleUI();
    }
}
