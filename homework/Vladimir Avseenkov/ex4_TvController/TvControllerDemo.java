package ex4_TvController;

import ex3_TV.TV;

public class TvControllerDemo {
    public static void main(String[] args) {
        TvController controller = new TvController();
        TV samsung = new TV("Samsung");
        controller.connect(samsung);
        controller.turnOn(samsung);
        for (int i = 0; i < 10; i++) {
            controller.increaseVolume(samsung);
        }
        controller.decrementChannel(samsung);
        controller.decrementChannel(samsung);
        controller.incrementChannel(samsung);
        System.out.println(samsung.toString());
    }
}
