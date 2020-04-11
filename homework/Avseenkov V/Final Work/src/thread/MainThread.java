package thread;

import service.ConsoleUI;

public class MainThread implements Runnable{
    @Override
    public void run() {
        ConsoleUI start = new ConsoleUI();
        start.startConsoleUI();
    }
}
