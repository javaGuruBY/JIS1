package by.jrr.thread;

import by.jrr.execute.OperationExecutor;

public class RunMyThread implements Runnable {
    @Override
    public void run() {
        OperationExecutor operationExecutor = new OperationExecutor();
        operationExecutor.runExecute();
    }
}
