package com.company.bean;

import com.company.service.CopyRangeService;

public class Main {

    public static void main(String[] args) {
	Thread thread = new Thread(new CopyRangeService());
	thread.start();
    }
}
