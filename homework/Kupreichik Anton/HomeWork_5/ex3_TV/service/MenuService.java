package com.company.service;

import com.company.MenuString.MenuString;
import com.company.bean.TV;

import java.util.Scanner;

public class MenuService {
    static Scanner in = new Scanner(System.in);
    static TvService tvService = new TvService();
    static TV philips = new TV();

    static int choose;

    public static void enterName(){
        System.out.println(MenuString.ENTER_NAME);
        String manufacturer;
        manufacturer = in.nextLine();
        manufacturer = in.nextLine();
        philips.setManufacturer(manufacturer);
    }

    public static void onTv(){
        if (philips.isSwitchedOnOff() == false) {
            System.out.println(MenuString.TV_ON);
            tvService.SwitchedOn();
        } else {
            System.out.println(MenuString.YOU_CANT_ON_TV);
        }
    }

    public static void offTv(){
        if (philips.isSwitchedOnOff() == true) {
            System.out.println(MenuString.TV_OFF);
            tvService.SwitchedOff();
        } else {
            System.out.println(MenuString.YOU_CANT_OFF_TV);
        }
    }

    public static void chooseChannel(){
        if (philips.isSwitchedOnOff() == true) {
            int currentChanel = -1;                                
            while ((currentChanel < 0) | (currentChanel > 100)) {
                System.out.println(MenuString.CHOOSE_CHANNEL);
                currentChanel = in.nextInt();
                if ((currentChanel < 0) | (currentChanel > 100)) {
                    System.out.println(MenuString.ERROR);
                } else {
                    philips.setCurrentChanel(currentChanel);
                }
            } }else{
            System.out.println(MenuString.YOU_CANT_INCREASE_CHANNEL);
        }
    }

    public static void increaseChannel(){
        if (philips.isSwitchedOnOff() == true) {
            System.out.println(MenuString.INCREASE_CHANNEL);
            tvService.currentChanelIncrease();
            System.out.println(MenuString.CURRENT_CHANNEL + philips.getCurrentChanel());
        } else {
            System.out.println(MenuString.YOU_CANT_INCREASE_CHANNEL);
        }
    }

    public static void reduceChannel(){
        if (philips.isSwitchedOnOff() == true) {
            System.out.println(MenuString.REDUCE_CHANNEL);
            tvService.currentChanelReduce();
            System.out.println(MenuString.CURRENT_CHANNEL + philips.getCurrentChanel());
        } else {
            System.out.println(MenuString.YOU_CANT_INCREASE_CHANNEL);
        }
    }

    public static void increaseVolume(){
        if (philips.isSwitchedOnOff() == true) {
            tvService.currentVolumeIncrease();
            System.out.println(MenuString.CURRENT_VOLUME + philips.getCurrentVolume());
        } else {
            System.out.println(MenuString.YOU_CANT_INCREASE_VOLUME);
        }
    }

    public static void reduceVolume(){
        if (philips.isSwitchedOnOff() == true) {
            tvService.currentVolumeReduce();
            System.out.println(MenuString.CURRENT_VOLUME + philips.getCurrentVolume());
        }else {
            System.out.println(MenuString.YOU_CANT_INCREASE_VOLUME);
        }
    }

    public static void info(){
        System.out.println(MenuString.MANUFACTURER +philips.getManufacturer());
        if(philips.isSwitchedOnOff())
            System.out.println(MenuString.TV_ON);
        else System.out.println(MenuString.TV_OFF);
        System.out.println(MenuString.CURRENT_VOLUME + philips.getCurrentVolume());
        System.out.println(MenuString.CHOOSE_CHANNEL + philips.getCurrentChanel());
    }

    public static void menu(){

        while (choose != -1) {
            System.out.println(MenuString.MENU);
            choose = in.nextInt();
            switch (choose) {
                case 1:
                    MenuService.enterName();
                    break;
                case 2:
                    MenuService.onTv();
                    break;
                case 3:
                    MenuService.offTv();
                    break;
                case 5:
                    MenuService.increaseChannel();
                    break;
                case 6:
                    MenuService.reduceChannel();
                    break;
                case 4:
                    MenuService.chooseChannel();
                    break;
                case 7:
                    MenuService.increaseVolume();
                    break;
                case 8:
                    MenuService.reduceVolume();
                    break;
                case 0:
                    MenuService.info();
                    break;
                case 9:
                    choose = -1;
                    break;
            }
        }
    }

}
