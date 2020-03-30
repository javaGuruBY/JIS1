package thread;

import console.UIConsole;

public class RunCreatThread implements Runnable {
    @Override
    public void run() {
        UIConsole.mainMenu();
    }
}
