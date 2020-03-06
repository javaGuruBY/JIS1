import Service.NumberService;

public class main {
    public static void main(String[] args) {
        NumberService numberService0 = new NumberService(1,5);
        NumberService numberService1 = new NumberService(5,1);
        Thread thread0 = new Thread(numberService0);
        thread0.start();
        Thread thread1 = new Thread(numberService1);
        thread1.start();
    }
}
