package com.company.bean;

import com.company.service.TV;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TV Philips = new TV();
        int choose = 0;
        while (choose != -1) {
            System.out.println("1.Ввести марку телевизора\n2.Включить телевизор\n3.Выключить телевизор");
            System.out.println("4.Выбрать канал\n5.Переключить на следующий канал\n6.Переключить на предыдущий канал");
            System.out.println("7.Увеличить звук\n8.Уменьшить звук\n9.Выход\n0.Вывести всю информацию\n");
            choose = in.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Введите марку телевизора\n");
                    String manufacturer;
                    manufacturer = in.nextLine();
                    manufacturer = in.nextLine();
                    Philips.setManufacturer(manufacturer);
                    break;
                case 2:
                    if (Philips.isSwitchedOnOff() == false) {
                        System.out.println("Телевизор включен\n");
                        Philips.SwitchedOn();
                    } else {
                        System.out.println("Нельзя включить включеннный телевизор\n");
                    }
                    break;
                case 3:
                    if (Philips.isSwitchedOnOff() == true) {
                        System.out.println("Телевизор выключен\n");
                        Philips.SwitchedOn();
                    } else {
                        System.out.println("Нельзя выключить выключеннный телевизор\n");
                    }
                    break;
                case 5:
                    if (Philips.isSwitchedOnOff() == true) {
                        System.out.println("Включен следующий канал\n");
                        Philips.currentChanelIncrease();
                        System.out.println("Текущий канал " + Philips.getCurrentChanel());
                    } else {
                        System.out.println("Нельзя переключить канал когда телевизор выключен\n");
                    }
                    break;
                case 6:
                    if (Philips.isSwitchedOnOff() == true) {
                        System.out.println("Включен предыдущий канал канал\n");
                        Philips.currentChanelReduce();
                        System.out.println("Текущий канал " + Philips.getCurrentChanel());
                    } else {
                        System.out.println("Нельзя переключить канал когда телевизор выключен\n");
                    }
                    break;
                case 4:
                    if (Philips.isSwitchedOnOff() == true) {
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
                    break;
                case 7:
                    if (Philips.isSwitchedOnOff() == true) {
                        Philips.currentVolumeIncrease();
                        System.out.println("Текущая громкость " + Philips.getCurrentVolume());
                    } else {
                        System.out.println("Нельзя увеличить громкость когда телевизор выключен\n");
                    }
                    break;
                case 8:
                    if (Philips.isSwitchedOnOff() == true) {
                        Philips.currentVolumeReduce();
                        System.out.println("Текущая громкость " + Philips.getCurrentVolume());
                    }else {
                            System.out.println("Нельзя уменьшить громкость когда телевизор выключен\n");
                        }
                        break;
                    case 0:
                        System.out.println("Марка телевизора: " +Philips.getManufacturer());
                        if(Philips.isSwitchedOnOff())
                            System.out.println("Питание включено");
                        else System.out.println("Питание выключено");
                        System.out.println("Текущая громкость: " + Philips.getCurrentVolume());
                        System.out.println("Текущий канал: " + Philips.getCurrentChanel());
                            break;
                case 9:
                    choose = -1;
                    break;
            }
        }
    }
}
