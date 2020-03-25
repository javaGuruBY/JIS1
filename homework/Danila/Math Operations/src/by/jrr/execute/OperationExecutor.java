package by.jrr.execute;

import by.jrr.interfaces.MathOperation;
import by.jrr.service.AdditionOperation;
import by.jrr.service.DifferenceOperation;
import by.jrr.service.DivisionOperation;
import by.jrr.service.MultiplicationOperation;

public class OperationExecutor {
    public void runExecute() {
        OperationExecutor executor = new OperationExecutor();

        MathOperation[] operations = {
                new AdditionOperation(),
                new DifferenceOperation(),
                new DivisionOperation(),
                new MultiplicationOperation()
        };

        executor.execute(operations, 5, 12);
        executor.execute(operations, 27, 3);
    }

    private void execute(MathOperation[] operations, double a, double b) {
        for (MathOperation operation: operations) {
            System.out.println(operation.getName() + " " + operation.compute(a, b));
        }
        System.out.println();
    }
}
