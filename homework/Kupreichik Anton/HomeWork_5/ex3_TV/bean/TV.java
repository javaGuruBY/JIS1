package com.company.bean;

public class TV implements Serialiazible {

    private int currentChanel;
    private int currentVolume;
    private String manufacturer;
    private boolean switchedOnOff = false;

    public TV() {};
    public int getCurrentChanel() {
        return currentChanel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentChanel(int currentChanel) {
        this.currentChanel = currentChanel;
        System.out.println("Текущий канал: " + currentChanel);
    }

    public void setManufacturer(String manufacturer) {
        System.out.println("Производитель: " + manufacturer);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setSwitchedOnOff(boolean switchedOnOff) {
        this.switchedOnOff = switchedOnOff;
    }

    public boolean isSwitchedOnOff() {
        return switchedOnOff;
    }
}
