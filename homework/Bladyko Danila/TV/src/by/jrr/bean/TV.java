package by.jrr.bean;

import java.util.Objects;

public class TV {
    protected int currentChannel;
    protected int currentVolume;
    protected String producer = "JavaGuru";
    protected boolean isSwitched;

    public TV() {
    }

    public TV(int currentChannel, int currentVolume, String producer, boolean isSwitched) {
        this.currentChannel = currentChannel;
        this.currentVolume = currentVolume;
        this.producer = producer;
        this.isSwitched = isSwitched;
    }

    public void increaseChannel() {
        if (tvIsOn()) {
            this.currentChannel++;
        }
    }

    public void reduceChannel() {
        if (tvIsOn()) {
            this.currentChannel--;
        }
    }

    public void increaseVoice() {
        if (tvIsOn()) {
            this.currentVolume++;
        }
    }

    public void reduceVoice() {
        if (tvIsOn()) {
            this.currentVolume--;
        }
    }

    public void onTV() {
        isSwitched = true;
    }

    public void offTV() {
        isSwitched = false;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public boolean isSwitched() {
        return isSwitched;
    }

    public void setSwitched(boolean switched) {
        isSwitched = switched;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return currentChannel == tv.currentChannel &&
                currentVolume == tv.currentVolume &&
                isSwitched == tv.isSwitched &&
                Objects.equals(producer, tv.producer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentChannel, currentVolume, producer, isSwitched);
    }

    @Override
    public String toString() {
        return "TV{" +
                "currentChannel=" + currentChannel +
                ", currentVolume=" + currentVolume +
                ", producer='" + producer + '\'' +
                ", isSwitched=" + isSwitched +
                '}';
    }

    private boolean tvIsOn() {
        return isSwitched;
    }
}
