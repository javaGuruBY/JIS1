package com.vladis1350.service;

import com.vladis1350.bean.Tv;

public class TvController {
    Tv connectedTv = new Tv();

    public TvController(Tv connectedTv) {
        this.connectedTv = connectedTv;
    }

    public TvController() {
        connectedTv.setWorking(false);
        connectedTv.setCurrentChannel(5);
        connectedTv.setCurrentVoice(35);
        connectedTv.setManufacturer("Sumsung");
    }

    public void nextChanel() {
        if (checkWorkTv()) {
            connectedTv.setCurrentChannel(connectedTv.getCurrentChannel() + 1);
        }
    }

    public void previousChanel() {
        if (checkWorkTv()) {
            connectedTv.setCurrentChannel(connectedTv.getCurrentChannel() - 1);
        }
    }

    public void increaseCurrentVoice() {
        if (checkWorkTv()) {
            connectedTv.setCurrentVoice(connectedTv.getCurrentVoice() + 1);
        }
    }

    public void decreaseCurrentVoice() {
        if (checkWorkTv()) {
            connectedTv.setCurrentVoice(connectedTv.getCurrentVoice() - 1);
        }
    }

    public void turnOnTV() {
        connectedTv.setWorking(true);
    }

    public void turnOffTV() {
        connectedTv.setWorking(false);
    }

    public boolean checkWorkTv() {
        return connectedTv.isWorking();
    }

    public int getCurrentChannel() {
        return connectedTv.getCurrentChannel();
    }

    public int getCurrentVoice() {
        return connectedTv.getCurrentVoice();
    }

    public String getManufacturer() {
        return connectedTv.getManufacturer();
    }

    public boolean isWorking() {
        return connectedTv.isWorking();
    }
}
