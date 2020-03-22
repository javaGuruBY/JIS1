package com.vladis1350;

import com.vladis1350.bean.User;
import com.vladis1350.service.UserLoginService;

public class UserLoginServiceDemo {
    public static void main(String[] args) {
        UserLoginService service = new UserLoginService();
        User userVlad = new User("Vladislav", "332211");
        System.out.println(service.login(userVlad, "332211"));

        User userVictor = new User("Victor", "vitya1234");
        System.out.println(service.login(userVictor, "123321"));
        System.out.println(service.login(userVictor, "332211"));
        System.out.println(service.login(userVictor, "vitya123"));
        System.out.println(service.login(userVictor, "vitya1235"));

        User userMax = new User("Max", "maxJavaGuru");
        System.out.println(service.login(userMax, "maxJava"));
        System.out.println(service.login(userMax, "MaxGuru"));
        System.out.println(service.login(userMax, "maxJavaGuru"));

    }
}
