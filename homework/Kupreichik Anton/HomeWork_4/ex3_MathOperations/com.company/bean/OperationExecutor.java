package com.company.bean;

import com.company.interfaces.MathOperation;

import java.util.ArrayList;

public class OperationExecutor {
        public static void execute(ArrayList<MathOperation> operations, double a, double b) {
            operations.stream().forEach(i-> System.out.println(i.compute(a,b)));
        }
    }
