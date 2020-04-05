package thread;

public class CreatThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new RunCreatThread());
        thread.start();
    }
}
