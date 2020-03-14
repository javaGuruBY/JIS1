public class Application {

    public static void main(String[] args) {
        Thread thread = new Thread(new OperationExecutor());
        thread.start();
    }
}
