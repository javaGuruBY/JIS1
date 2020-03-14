import interfaces.MathOperations;
import service.Addition;
import service.Division;
import service.Multiplication;
import service.Substract;

public class OperationExecutor implements Runnable {

    void mathOps() {
        MathOperations[] mathOperations = {new Addition(), new Division(), new Multiplication(), new Substract()};
        execute(mathOperations, 3, 5);

        execute(mathOperations, 10, 667);
    }

    void execute(MathOperations[] mathOperations, double a, double b) {
        for (MathOperations operations : mathOperations) {
            System.out.println("Result for " + operations.getName() + " is " + operations.compute(a, b));
        }
    }

    @Override
    public void run() {
        mathOps();
    }
}