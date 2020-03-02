package com.company.service;
import com.company.service.TV;

public class TVController
{
    private boolean isConnected = false;

    public TVController(TV tv){
        System.out.println("Подключен к телевизору: " +tv.getManufacturer());
        setConnected(true);
    }

    public void setConnected(boolean connected) {
        isConnected = connected;
    }

    public void ControllerOnOff(boolean connected){
        this.isConnected = connected;
    }

    public int getCurrentChanel(TV tv) {
        return tv.getCurrentChanel();
    }

    public int getCurrentVolume(TV tv) {
        return tv.getCurrentVolume();
    }

    public void SwitchedOn(TV tv){
        tv.setSwitchedOnOff(true);
    }

    public void SwitchedOff(TV tv){
        tv.setSwitchedOnOff(false);
    }

    public boolean isSwitchedOnOff(TV tv) {
        return tv.isSwitchedOnOff();
    }

    public void setCurrentChanel(TV tv, int currentChanel) {
        tv.setCurrentChanel(currentChanel);
        System.out.println("Текущий канал: " + currentChanel);
    }

    public void currentChanelIncrease(TV tv) {
        if ((tv.getCurrentChanel() + 1) > 100) {
            System.out.println("Выберите каналв диапазоне [0,100]");
        } else {
            tv.setCurrentChanel(tv.getCurrentChanel() + 1);
        }
    }

    public void currentChanelReduce(TV tv) {
        if ((tv.getCurrentChanel() -1 ) < 0) {
            System.out.println("Выберите каналв диапазоне [0,100]");
        } else {
            tv.setCurrentChanel(tv.getCurrentChanel() - 1);
        }
    }

    public void currentVolumeReduce(TV tv) {
        if (tv.getCurrentVolume() - 1 < 0) {
            System.out.println("Минимальная громкость 0");
        } else {
            tv.setCurrentVolume(tv.getCurrentVolume() - 1);
        }
    }

    public void currentVolumeIncrease(TV tv) {
        if ((tv.getCurrentVolume() + 1) > 10) {
            System.out.println("Максимальная громкость 10");
        } else {
            tv.setCurrentVolume(tv.getCurrentVolume() + 1);
        }
    }

    public String getManufacturer(TV tv) {
        return tv.getManufacturer();
    }
}
