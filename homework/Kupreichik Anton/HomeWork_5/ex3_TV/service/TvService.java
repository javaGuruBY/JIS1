package com.company.service;

import com.company.bean.TV;

public class TvService {
    TV tv = new TV();

    public void SwitchedOn() {
        tv.setSwitchedOnOff(true);
    }

    public void SwitchedOff() {
        tv.setSwitchedOnOff(false);
    }


    public boolean isSwitchedOnOff() {
        return tv.isSwitchedOnOff();
    }


    public int currentChanelIncrease() {
        if ((tv.getCurrentChanel() + 1) > 100 ) {
            System.out.println("Выберите каналв диапазоне [0,100]");
        } else {
            tv.setCurrentChanel(tv.getCurrentChanel() + 1);
        }
        return tv.getCurrentChanel();
    }

    public int currentChanelReduce() {
        if ((tv.getCurrentChanel() -1 ) < 0) {
            System.out.println("Выберите каналв диапазоне [0,100]");
        } else {
            tv.setCurrentChanel(tv.getCurrentChanel() - 1);
        }
        return tv.getCurrentChanel();
    }
    public int currentVolumeReduce() {
        if (tv.getCurrentVolume() - 1 < 0) {
            System.out.println("Минимальная громкость 0");
        } else {
            tv.setCurrentVolume(tv.getCurrentVolume() - 1);
        }
        return tv.getCurrentVolume();
    }

    public int currentVolumeIncrease() {
        if ((tv.getCurrentVolume() + 1) > 10) {
            System.out.println("Максимальная громкость 10");
        } else {
            tv.setCurrentVolume(tv.getCurrentVolume() + 1);
        }
        return tv.getCurrentVolume();
    }
}
