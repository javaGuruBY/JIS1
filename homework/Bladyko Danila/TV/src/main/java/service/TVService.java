package service;

import bean.TV;
import interfaces.TVInterface;

public class TVService implements TVInterface {
    @Override
    public void switchToTheNextChannel(TV tv) {
        tv.currentChannel++;
    }

    @Override
    public void switchToPreviousChannel(TV tv) {
        tv.currentChannel--;
    }

    @Override
    public void increaseVoice(TV tv) {
        tv.currentVoice++;
    }

    @Override
    public void reduceVoice(TV tv) {
        tv.currentVoice--;
    }

    @Override
    public void turnOnTV(TV tv) {
        tv.TVIsOn = true;
    }

    @Override
    public void turnOffTV(TV tv) {
        tv.TVIsOn = false;
    }
}
