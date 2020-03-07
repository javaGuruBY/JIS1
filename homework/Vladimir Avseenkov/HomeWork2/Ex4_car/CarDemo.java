package HomeWork2.Ex4_car;

public class CarDemo {
    public static void main(String[] args) throws Exception {
        Car bmw = new Car("BMW E39", "Rusty-Dusty", 230);
        bmw.accelerate(123);
        System.out.println(bmw.toString());
        bmw.decelerate(-500);
        System.out.println(bmw.toString());

        Car SAAB = new Car("SAAB 95", "Cosmic Blue", 260);
        SAAB.accelerate(333);
        System.out.println(SAAB.toString());

        if (!bmw.isDriving()) {
            System.out.println(bmw.getModel() + " now is stopped, because it's almost broken!");
        }

        if (SAAB.isDriving()) {
            System.out.println(SAAB.getModel() + ". Born from jets. ");
        }

        if (SAAB.canAccelerate()) {
            System.out.println("Infinity is not a limit");
        }

        CarTest test = new CarTest();
        test.run();
    }
}
