package by.jrr.bean;

import java.util.Objects;

public class TVController {
    public TV tv = new TV();

    public TVController() {
        this.tv.isSwitched = false;
        this.tv.currentChannel = 1;
        this.tv.currentVolume = 1;
        this.tv.producer = "JavaGuru";
    }

    public TVController(TV tv) {
        this.tv = tv;
    }

    public void increaseChannel() {
        if (tvIsOn()) {
            this.tv.currentChannel++;
        }
    }

    public void reduceChannel() {
        if (tvIsOn()) {
            this.tv.currentChannel--;
        }
    }

    public void increaseVoice() {
        if (tvIsOn()) {
            this.tv.currentVolume++;
        }
    }

    public void reduceVoice() {
        if (tvIsOn()) {
            this.tv.currentVolume--;
        }
    }

    public void onTV() {
        this.tv.isSwitched = true;
    }

    public void offTV() {
        this.tv.isSwitched = false;
    }

    public int getCurrentChannel() {
        return this.tv.currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        this.tv.currentChannel = currentChannel;
    }

    public int getCurrentVolume() {
        return this.tv.currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.tv.currentVolume = currentVolume;
    }

    public String getProducer() {
        return this.tv.producer;
    }

    public void setProducer(String producer) {
        this.tv.producer = producer;
    }

    public boolean isSwitched() {
        return this.tv.isSwitched;
    }

    public void setSwitched(boolean switched) {
        this.tv.isSwitched = switched;
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    private boolean tvIsOn() {
        return this.tv.isSwitched;
    }
}
