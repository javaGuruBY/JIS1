package com.vladis1350.bean;

import java.util.Objects;

public class Tv {
    private int currentChannel;
    private int currentVoice;
    private String manufacturer;
    private boolean isWorking;

    public Tv() {
    }

    public Tv(int currentChannel, int currentVoice, String manufacturer, boolean isWorking) {
        this.currentChannel = currentChannel;
        this.currentVoice = currentVoice;
        this.manufacturer = manufacturer;
        this.isWorking = isWorking;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public void setCurrentVoice(int currentVoice) {
        this.currentVoice = currentVoice;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public void nextChanel() {
        if (this.isWorking == true) {
            this.currentChannel++;
        }
    }

    public void previousChanel() {
        if (this.isWorking == true) {
            this.currentChannel--;
        }
    }

    public void increaseCurrentVoice() {
        if (this.isWorking == true) {
            this.currentVoice++;
        }
    }

    public void decreaseCurrentVoice() {
        if (this.isWorking == true) {
            this.currentVoice--;
        }
    }

    public void turnOnTV() {
        this.isWorking = true;
    }

    public void turnOffTV() {
        this.isWorking = false;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public int getCurrentVoice() {
        return currentVoice;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public boolean isWorking() {
        return isWorking;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tv tv = (Tv) o;
        return currentChannel == tv.currentChannel &&
                currentVoice == tv.currentVoice &&
                isWorking == tv.isWorking &&
                Objects.equals(manufacturer, tv.manufacturer);
    }

    @Override
    public String toString() {
        return "Tv{" +
                "currentChannel=" + currentChannel +
                ", currentVoice=" + currentVoice +
                ", manufacturer='" + manufacturer + '\'' +
                ", isWorking=" + isWorking +
                '}';
    }
}
