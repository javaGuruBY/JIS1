package com.company.bean;
import com.company.service.TV;
import com.company.service.TVController;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        TV Philips = new TV();
        int choose = 0;
        while (choose != -1) {
            System.out.println("1.Ввести марку телевизора\n2.Включить телевизор\n3.Выключить телевизор");
            System.out.println("4.Выбрать канал\n5.Переключить на следующий канал\n6.Переключить на предыдущий канал");
            System.out.println("7.Увеличить звук\n8.Уменьшить звук\n9.Выход\n10.Подключить пульт и работать через него\n0.Вывести всю информацию\n");
            choose = in.nextInt();
            switch (choose) {
                case 10:
                    TVController tvController = new TVController(Philips);
                    int secondChoose = 0;
                    while (secondChoose != -1) {
                        System.out.println("1.Включить телевизор\n2.Выключить телевизор");
                        System.out.println("3.Выбрать канал\n4.Переключить на следующий канал\n5.Переключить на предыдущий канал");
                        System.out.println("6.Увеличить звук\n7.Уменьшить звук\n8.Отключить пульт и работать через телевизор\n9.Вывести всю информацию\n");
                        System.out.println("0.Выход\n");
                        secondChoose = in.nextInt();
                        switch (secondChoose){
                            case 1:
                                if (tvController.isSwitchedOnOff(Philips) == false) {
                                    System.out.println("Телевизор включен\n");
                                    tvController.SwitchedOn(Philips);
                                } else {
                                    System.out.println("Нельзя включить включеннный телевизор\n");
                                }
                                break;
                            case 2:
                                if (tvController.isSwitchedOnOff(Philips) == true) {
                                    System.out.println("Телевизор выключен\n");
                                    tvController.SwitchedOff(Philips);
                                } else {
                                    System.out.println("Нельзя выключить выключеннный телевизор\n");
                                }
                                break;
                            case 3:
                                if (tvController.isSwitchedOnOff(Philips) == true) {
                                    int currentChanel = -1;                                ;
                                    while ((currentChanel < 0) | (currentChanel > 100)) {
                                        System.out.println("Выберете канал");
                                        currentChanel = in.nextInt();
                                        if ((currentChanel < 0) | (currentChanel > 100)) {
                                            System.out.println("Неверный выбор");
                                        } else {
                                            tvController.setCurrentChanel(Philips,currentChanel);
                                        }
                                    } }else{
                                    System.out.println("Нельзя переключить канал когда телевизор выключен\n");
                                }
                                break;
                            case 4:
                                if (tvController.isSwitchedOnOff(Philips) == true) {
                                    System.out.println("Включен следующий канал\n");
                                    tvController.currentChanelIncrease(Philips);
                                    System.out.println("Текущий канал " + tvController.getCurrentChanel(Philips));
                                } else {
                                    System.out.println("Нельзя переключить канал когда телевизор выключен\n");
                                }
                                break;
                            case 5:
                                if (tvController.isSwitchedOnOff(Philips) == true) {
                                    System.out.println("Включен предыдущий канал канал\n");
                                    tvController.currentChanelReduce(Philips);
                                    System.out.println("Текущий канал " + tvController.getCurrentChanel(Philips));
                                } else {
                                    System.out.println("Нельзя переключить канал когда телевизор выключен\n");
                                }
                                break;
                            case 6:
                                if (tvController.isSwitchedOnOff(Philips) == true) {
                                    tvController.currentVolumeIncrease(Philips);
                                    System.out.println("Текущая громкость " + tvController.getCurrentVolume(Philips));
                                } else {
                                    System.out.println("Нельзя увеличить громкость когда телевизор выключен\n");
                                }
                                break;
                            case 7:
                                if (tvController.isSwitchedOnOff(Philips) == true) {
                                    tvController.currentVolumeReduce(Philips);
                                    System.out.println("Текущая громкость " + tvController.getCurrentVolume(Philips));
                                }else {
                                    System.out.println("Нельзя уменьшить громкость когда телевизор выключен\n");
                                }
                                break;
                            case 8:
                                tvController.ControllerOnOff(false);
                                System.out.println("Пульт отключен");
                                secondChoose = -1;
                                break;
                            case 9:
                                System.out.println("Марка телевизора: " +tvController.getManufacturer(Philips));
                                if(tvController.isSwitchedOnOff(Philips))
                                    System.out.println("Питание включено");
                                else System.out.println("Питание выключено");
                                System.out.println("Текущая громкость: " + tvController.getCurrentVolume(Philips));
                                System.out.println("Текущий канал: " + tvController.getCurrentChanel(Philips));
                                System.out.println("\n\n+");
                                break;
                            case 0:
                                secondChoose = -1;
                                break;
                        }
                    }
                    break;
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
                        Philips.setSwitchedOnOff(true);
                    } else {
                        System.out.println("Нельзя включить включеннный телевизор\n");
                    }
                    break;
                case 3:
                    if (Philips.isSwitchedOnOff() == true) {
                        System.out.println("Телевизор выключен\n");
                        Philips.setSwitchedOnOff(false);
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
