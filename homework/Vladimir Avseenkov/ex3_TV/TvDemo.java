package ex3_TV;

public class TvDemo {
    public static void main(String[] args) {
        TV tv0 = new TV("Samsung");
        TV tv1 = new TV("Horizont");

        tv0.turnOn();

        for (int i = 0; i < 5; i++) {
            tv0.incrementChannel();
        }

        for (int i = 0; i < 10; i++) {
            tv1.incrementChannel();
        }

        for (int i = 0; i < 50; i++) {
            tv0.incrementVolume();
        }

        System.out.println(tv0.toString());
        System.out.println(tv1.toString());

    }


}
