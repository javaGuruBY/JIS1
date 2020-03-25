package com.company.service;

import com.company.bean.TV;

public class TvService{

    public void currentChanelIncrease(TV tv) {
        if (tv.getCurrentChanel() + 1  > 1002)
         {
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
            tv.setCurrentVolume(tv.getCurrentVolume()- 1);
        }
    }

    public void currentVolumeIncrease(TV tv) {
        if ((tv.getCurrentVolume() + 1) > 10) {
            System.out.println("Максимальная громкость 10");
        } else {
            tv.setCurrentVolume(tv.getCurrentVolume() + 1);
        }
    }

    public boolean isSwitchedOnOff(TV tv) {
        return tv.isSwitchedOnOff();
    }


}
