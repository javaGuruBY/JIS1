package interfaces;

import bean.TV;

public interface TVInterface {
    void switchToTheNextChannel(TV tv);
    void switchToPreviousChannel(TV tv);
    void increaseVoice(TV tv);
    void reduceVoice(TV tv);
    void turnOnTV(TV tv);
    void turnOffTV(TV tv);
}
