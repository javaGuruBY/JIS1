package com.company.service;

public class TV {
    private int currentChanel;
    private int currentVolume;
    private String manufacturer;
    private boolean switchedOnOff = false;

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

    public boolean isSwitchedOnOff() {
        return switchedOnOff;
    }

    public void setCurrentChanel(int currentChanel) {
        this.currentChanel = currentChanel;
        System.out.println("Текущий канал: " + currentChanel);
    }

    public void currentChanelIncrease() {
        if ((currentChanel + 1) > 1002
        ) {
            System.out.println("Выберите каналв диапазоне [0,100]");
        } else {
            this.currentChanel = currentChanel + 1;
        }
    }

    public void currentChanelReduce() {
        if ((currentChanel -1 ) < 0) {
            System.out.println("Выберите каналв диапазоне [0,100]");
        } else {
            this.currentChanel = currentChanel - 1;
        }
    }

    public void currentVolumeReduce() {
        if (currentVolume - 1 < 0) {
            System.out.println("Минимальная громкость 0");
        } else {
            this.currentVolume = currentVolume - 1;
        }
    }

    public void currentVolumeIncrease() {
        if ((currentVolume + 1) > 10) {
            System.out.println("Максимальная громкость 10");
        } else {
            this.currentVolume = currentVolume + 1;
        }
    }

    public void setManufacturer(String manufacturer) {
        System.out.println("Производитель: " + manufacturer);
        this.manufacturer = manufacturer;
    }
}
