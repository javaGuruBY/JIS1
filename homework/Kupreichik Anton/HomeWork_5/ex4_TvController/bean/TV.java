package com.company.bean;

import com.company.service.TvService;

import java.io.Serializable;
import java.util.Objects;

public class TV implements Serializable {
    private int currentChanel;
    private int currentVolume;
    private String manufacturer;
    private boolean switchedOnOff = false;
    
    public TV() { };
    
    public TV(int currentChanel, int currentVolume, String manufacturer, boolean switchadOnOff){
        this.currentChanel =  currentChanel;
        this.currentVolume =  currentVolume;
        this.manufacturer =  manufacturer;
        this.switchedOnOff = switchedOnOff;
    }

    public int getCurrentChanel() {
        return currentChanel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setSwitchedOnOff(boolean switched) {
        this.switchedOnOff = switched;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public void setManufacturer(String manufacturer) {
        System.out.println("Производитель: " + manufacturer);
        this.manufacturer = manufacturer;
    }

    public void setCurrentChanel(int currentChanel) {
        this.currentChanel = currentChanel;
        System.out.println("Текущий канал: " + currentChanel);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return currentChanel == tv.currentChanel &&
                currentVolume == tv.currentVolume &&
                switchedOnOff == tv.switchedOnOff &&
                Objects.equals(manufacturer, tv.manufacturer);
    }

    public boolean isSwitchedOnOff() {
        return switchedOnOff;
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentChanel, currentVolume, manufacturer, switchedOnOff);
    }

    @Override
    public String toString() {
        return "TV{" +
                "currentChanel=" + currentChanel +
                ", currentVolume=" + currentVolume +
                ", manufacturer='" + manufacturer + '\'' +
                ", switchedOnOff=" + switchedOnOff +
                '}';
    }
}
