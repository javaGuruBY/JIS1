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

    public boolean SwitchedOn() {
        this.switchedOnOff = true;
        return true;
    }

    public boolean isSwitchedOnOff() {
        return switchedOnOff;
    }

    public void setCurrentChanel(int currentChanel) {
        this.currentChanel = currentChanel;
        System.out.println("Текущий канал: " + currentChanel);
    }


    public int currentChanelIncrease() {
        if ((currentChanel + 1) > 100 ) {
            System.out.println("Выберите каналв диапазоне [0,100]");
        } else {
            this.currentChanel = currentChanel + 1;
        }
        return currentChanel;
    }

    public int currentChanelReduce() {
        if ((currentChanel -1 ) < 0) {
            System.out.println("Выберите каналв диапазоне [0,100]");
        } else {
            this.currentChanel = currentChanel - 1;
        }
        return currentChanel;
    }
    public int currentVolumeReduce() {
        if (currentVolume - 1 < 0) {
            System.out.println("Минимальная громкость 0");
        } else {
            this.currentVolume = currentVolume - 1;
        }
        return currentVolume;
    }

    public int currentVolumeIncrease() {
        if ((currentVolume + 1) > 10) {
            System.out.println("Максимальная громкость 10");
        } else {
            this.currentVolume = currentVolume + 1;
        }
        return currentVolume;
    }

    public void setManufacturer(String manufacturer) {
        System.out.println("Производитель: " + manufacturer);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

}
