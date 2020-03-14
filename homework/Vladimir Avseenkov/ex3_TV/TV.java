package ex3_TV;

import java.util.Objects;

public class TV {
    int currentChannel = 1;
    int currentVolume = 0;
    String brandName;
    boolean isItOn;

    public void incrementChannel() {
        if (isItOn) {
            this.currentChannel++;
        }
    }

    public void decrementChannel() {
        if (isItOn && this.currentChannel > 1) {
            this.currentChannel--;
        }
    }

    public void incrementVolume() {
        if (isItOn) {
            this.currentVolume++;
        }
    }

    public void decrementVolume() {
        if (isItOn && this.currentVolume > 0) {
            this.currentVolume--;
        }
    }

    public void turnOn() {
        this.isItOn = true;
    }

    public void turnOff() {
        this.isItOn = false;
    }

    @Override
    public String toString() {
        if (this.brandName.equals("Horizont") && !getCurrentState()) {
            return "TV { " +
                    "currentChannel = " + currentChannel +
                    ", currentVolume = " + currentVolume +
                    ", brandName = " + brandName +
                    ", isItOn = " + isItOn + " - because it's broken }";
        } else {
            return "TV { " +
                    "currentChannel = " + currentChannel +
                    ", currentVolume = " + currentVolume +
                    ", brandName = " + brandName +
                    ", isItOn = " + isItOn +
                    '}';
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TV)) return false;
        TV tv = (TV) o;
        return currentChannel == tv.currentChannel &&
                currentVolume == tv.currentVolume &&
                isItOn == tv.isItOn &&
                Objects.equals(brandName, tv.brandName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentChannel, currentVolume, brandName, isItOn);
    }

    public TV(String brandName) {
        this.brandName = brandName;
    }

    public boolean getCurrentState() {
        return isItOn;
    }

    public String getCurrentChannel() {
        return "Current channel is " + currentChannel;
    }

    public String getCurrentVolume() {
        return "Current volume is " + currentVolume;
    }


}
