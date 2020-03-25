package com.company.bean;

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

}
