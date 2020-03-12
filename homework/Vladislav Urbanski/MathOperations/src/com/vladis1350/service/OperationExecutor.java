package com.vladis1350.service;

import com.vladis1350.interfaces.MathOperation;
import com.vladis1350.operations.AdditionOperation;
import com.vladis1350.operations.DivisionOperation;
import com.vladis1350.operations.MultiplicationOperation;
import com.vladis1350.operations.SubtractionOperation;

public class OperationExecutor implements Runnable {
    public void execute(MathOperation[] operations, double a, double b) {
        for (int i = 0; i < operations.length; i++) {
            System.out.println(operations[i].compute(a, b));
        }
    }

    @Override
    public void run() {
        MathOperation[] operations = {
                new AdditionOperation(),
                new DivisionOperation(),
                new MultiplicationOperation(),
                new SubtractionOperation()
        };

        execute(operations, 17, 6);
    }
}
