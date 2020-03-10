package com.company.bean;

import com.company.interfaces.MathOperation;
import com.company.service.*;

import java.util.ArrayList;

public class MathOperationDemo {

    public static void main(String[] args) {
        ArrayList<MathOperation> ops = new ArrayList<>();
                ops.add(new AdditionOperation());
                ops.add(new SubtractionOperation());
                ops.add(new MultiplicationOperation());
                ops.add(new DivisionOperation());

    OperationExecutor.execute(ops,5,3);
    }
}
