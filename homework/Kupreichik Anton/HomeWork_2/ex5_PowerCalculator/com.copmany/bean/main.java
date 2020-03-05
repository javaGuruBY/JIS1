package com.company.bean;

import com.company.service.PowerCalculator;

public class Main {

    public static void main(String[] args) {
	Thread thread = new Thread(new PowerCalculator());
	thread.start();
    }
}
