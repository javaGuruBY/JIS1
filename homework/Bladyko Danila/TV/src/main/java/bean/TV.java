package bean;

import java.io.Serializable;
import java.util.Objects;

public class TV implements Serializable {
    public int currentChannel;
    public int currentVoice;
    public String manufacturer;
    public boolean TVIsOn;

    public TV() {
        TVIsOn = false;
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

    public boolean isTVIsOn() {
        return TVIsOn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TV tv = (TV) o;
        return currentChannel == tv.currentChannel &&
                currentVoice == tv.currentVoice &&
                TVIsOn == tv.TVIsOn &&
                Objects.equals(manufacturer, tv.manufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentChannel, currentVoice, manufacturer, TVIsOn);
    }

    @Override
    public String toString() {
        return "TV{" +
                "currentChannel=" + currentChannel +
                ", currentVoice=" + currentVoice +
                ", manufacturer='" + manufacturer + '\'' +
                ", TVIsOn=" + TVIsOn +
                '}';
    }
}
