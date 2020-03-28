package com.company.service;

import com.company.bean.TV;
import com.company.bean.TVController;

import java.util.Scanner;

public class MenuService {

    static Scanner in = new Scanner(System.in);
    static TV Philips = new TV();
    static TVController tvController = new TVController(Philips);

    static int choose, secondChoose;

    public static void enterManufacture(){
        System.out.println("Введите марку телевизора\n");
        String manufacturer;
        manufacturer = in.nextLine();
        manufacturer = in.nextLine();
        Philips.setManufacturer(manufacturer);
    }

    public static void powerOn(){
        if (Philips.isSwitchedOnOff(Philips) == false) {
            System.out.println("Телевизор включен\n");
            Philips.setSwitchedOnOff(true);
        } else {
            System.out.println("Нельзя включить включеннный телевизор\n");
        }
    }

    public static void powerOff(){
        if (Philips.isSwitchedOnOff(Philips) == true) {
            System.out.println("Телевизор выключен\n");
            Philips.setSwitchedOnOff(false);
        } else {
            System.out.println("Нельзя выключить выключеннный телевизор\n");
        }
    }

    public static void increaseChannel(){
        if (Philips.isSwitchedOnOff(Philips) == true) {
            System.out.println("Включен следующий канал\n");
            Philips.currentChanelIncrease(Philips);
            System.out.println("Текущий канал " + Philips.getCurrentChanel());
        } else {
            System.out.println("Нельзя переключить канал когда телевизор выключен\n");
        }
    }

    public static void reduceChannel(){
        if (Philips.isSwitchedOnOff(Philips) == true) {
            System.out.println("Включен предыдущий канал канал\n");
            Philips.currentChanelReduce(Philips);
            System.out.println("Текущий канал " + Philips.getCurrentChanel());
        } else {
            System.out.println("Нельзя переключить канал когда телевизор выключен\n");
        }
    }

    public static void chooseChannel(){
        if (Philips.isSwitchedOnOff(Philips) == true) {
            int currentChanel = -1;                                ;
            while ((currentChanel < 0) | (currentChanel > 100)) {
                System.out.println("Выберете канал");
                currentChanel = in.nextInt();
                if ((currentChanel < 0) | (currentChanel > 100)) {
                    System.out.println("Неверный выбор");
                } else {
                    Philips.setCurrentChanel(currentChanel);
                }
            } }else{
            System.out.println("Нельзя переключить канал когда телевизор выключен\n");
        }
    }

    public static void increaseVolume(){
        if (Philips.isSwitchedOnOff(Philips) == true) {
            Philips.currentVolumeIncrease(Philips);
            System.out.println("Текущая громкость " + Philips.getCurrentVolume());
        } else {
            System.out.println("Нельзя увеличить громкость когда телевизор выключен\n");
        }
    }

    public static void reduceVolume(){
        if (Philips.isSwitchedOnOff(Philips) == true) {
            Philips.currentVolumeReduce(Philips);
            System.out.println("Текущая громкость " + Philips.getCurrentVolume());
        }else {
            System.out.println("Нельзя уменьшить громкость когда телевизор выключен\n");
        }
    }

    public static void infoAboutTV(){
        System.out.println("Марка телевизора: " +Philips.getManufacturer());
        if(Philips.isSwitchedOnOff(Philips))
            System.out.println("Питание включено");
        else System.out.println("Питание выключено");
        System.out.println("Текущая громкость: " + Philips.getCurrentVolume());
        System.out.println("Текущий канал: " + Philips.getCurrentChanel());
    }

    public static void menuTVString(){
        System.out.println("1.Ввести марку телевизора\n2.Включить телевизор\n3.Выключить телевизор");
        System.out.println("4.Выбрать канал\n5.Переключить на следующий канал\n6.Переключить на предыдущий канал");
        System.out.println("7.Увеличить звук\n8.Уменьшить звук\n9.Выход\n10.Подключить пульт и работать через него\n0.Вывести всю информацию\n");

    }

    public static void menuTvControllerString(){
        System.out.println("1.Включить телевизор\n2.Выключить телевизор");
        System.out.println("3.Выбрать канал\n4.Переключить на следующий канал\n5.Переключить на предыдущий канал");
        System.out.println("6.Увеличить звук\n7.Уменьшить звук\n8.Отключить пульт и работать через телевизор\n9.Вывести всю информацию\n");
        System.out.println("0.Выход\n");
    }

    public static void powerOffController(){
        tvController.ControllerOnOff(false);
        System.out.println("Пульт отключен");
    }

    public static void menuTv(){
        while (choose != -1) {
            MenuService.menuTVString();
            choose = in.nextInt();
            switch (choose) {
                case 10:
                    MenuService.menuTvController();
                    break;
                case 1:
                    MenuService.enterManufacture();
                    break;
                case 2:
                    MenuService.powerOn();
                    break;
                case 3:
                    MenuService.powerOff();
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
                    MenuService.infoAboutTV();
                    break;
                case 9:
                    choose = -1;
                    break;
            }
        }
    }

    public static void menuTvController(){
        while (secondChoose != -1) {
            MenuService.menuTvControllerString();
            secondChoose = in.nextInt();
            switch (secondChoose) {
                case 1:
                    MenuService.powerOn();
                    break;
                case 2:
                    MenuService.powerOff();
                    break;
                case 3:
                    MenuService.chooseChannel();
                    break;
                case 4:
                    MenuService.increaseChannel();
                    break;
                case 5:
                    MenuService.reduceChannel();
                    break;
                case 6:
                    MenuService.increaseVolume();
                    break;
                case 7:
                    MenuService.reduceVolume();
                    break;
                case 8:
                    MenuService.powerOffController();
                    secondChoose = -1;
                    break;
                case 9:
                    MenuService.infoAboutTV();
                    break;
                case 0:
                    secondChoose = -1;
                    break;
            }
        }
    }
}
