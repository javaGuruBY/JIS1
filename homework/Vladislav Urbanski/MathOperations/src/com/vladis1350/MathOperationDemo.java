package com.vladis1350;

import com.vladis1350.service.OperationExecutor;

public class MathOperationDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new OperationExecutor());
        thread.start();
    }
}
