package HomeWork2.Ex4_car;

public class CarTest {

    Car car = new Car("ZAZ 968M", "Invisible light", 999);

    public void run() throws Exception {
        shouldReturnIsDriving();
        shouldReturnItStopped();
        shouldReturnMaxSpeed();
        shouldReturnZeroSpeed();
    }

    void shouldReturnItStopped() {
        car.decelerate(0);
        boolean expected = true;
        boolean actual = car.isStopped();
        checkerBoolean(expected, actual);
    }

    void shouldReturnMaxSpeed () throws Exception {
        car.accelerate(11111);
        int expected = car.getMaxSpeed();
        int actual = car.getActualSpeed();
        String description = "Test for actual speed is ";
        checkerInt(expected, actual, description);
    }

    void checkerInt (int expected, int actual, String description) throws Exception {
        if (expected == actual) {
            System.out.println(description + "has passed");
        } else {
            throw new Exception(description + "has FAILED!");
        }
    }

    void checkerBoolean(boolean expected, boolean actual) {
        if (expected == actual) {
            System.out.println("Test passed");
        }
    }

    void shouldReturnIsDriving() {
        car.accelerate(667);
        boolean expected = true;
        boolean actual = car.isDriving();
        checkerBoolean(expected, actual);
    }

    void shouldReturnZeroSpeed () throws Exception {
        car.decelerate(-5000);
        int expected = 0;
        int actual = car.getActualSpeed();
        String description = "Test for zero speed is ";
        checkerInt(expected,actual,description);
    }

}
