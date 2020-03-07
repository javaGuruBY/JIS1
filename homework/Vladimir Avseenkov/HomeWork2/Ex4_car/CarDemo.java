package HomeWork2.Ex4_car;

public class CarDemo {
    public static void main(String[] args) {
        Car bmw = new Car("BMW E39", "Rusty-Dusty", 230);
        bmw.accelerate(123);
        System.out.println(bmw.toString());
        bmw.decelerate(-500);
        System.out.println(bmw.toString());

        Car SAAB = new Car("SAAB 95", "Cosmic Blue", 260);
        SAAB.accelerate(333);
        System.out.println(SAAB.toString());
    }
}
