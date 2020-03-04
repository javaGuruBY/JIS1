package ex4_TvController;

import ex3_TV.TV;

public class TvController {

    public boolean connected;

    public void connect (TV tv) {
        connected = true;
        System.out.println("Connected to the " + tv.getBrandName());
    }

    public void connectedTV (TV tv) {
        System.out.println(tv.getBrandName());
    }

    public void increaseVolume(TV tv) {
        tv.incrementVolume();
    }

    public void reduceVolume(TV tv) {
        tv.decrementVolume();
    }

    public void incrementChannel(TV tv) {
        tv.incrementChannel();
    }

    public void decrementChannel (TV tv) {
        tv.decrementChannel();
    }

    public void turnOn (TV tv) {
        tv.turnOn();
    }

    public void turnOff (TV tv) {
        tv.turnOff();
    }






}
