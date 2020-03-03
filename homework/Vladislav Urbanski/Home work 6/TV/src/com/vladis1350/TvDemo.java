package com.vladis1350;

import com.vladis1350.bean.Tv;

public class TvDemo {
    public static void main(String[] args) {
        Tv tvSumsung = new Tv(17, 32, "Samsung", true);
        Tv tvHp = new Tv(17, 32, "HP", false);

        System.out.println(tvHp.equals(tvSumsung));
        System.out.println(tvSumsung.toString());
        System.out.println(tvHp.toString());

        tvSumsung.increaseCurrentVoice();
        tvSumsung.nextChanel();
        tvSumsung.turnOffTV();
        tvSumsung.nextChanel();

        System.out.println(tvSumsung.toString());

        tvHp.nextChanel();
        tvHp.increaseCurrentVoice();

        tvHp.turnOnTV();
        tvHp.nextChanel();
        tvHp.nextChanel();

        System.out.println(tvHp.toString());
    }
}
