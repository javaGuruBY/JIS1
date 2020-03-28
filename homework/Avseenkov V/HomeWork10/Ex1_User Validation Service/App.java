public class App {

    public static void main(String[] args) {
        Thread thread = new Thread(new RunMe());
        thread.start();
    }
}
