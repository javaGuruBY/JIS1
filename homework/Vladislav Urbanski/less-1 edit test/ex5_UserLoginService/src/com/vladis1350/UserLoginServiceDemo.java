package com.vladis1350;

import com.vladis1350.bean.User;
import com.vladis1350.service.UserLoginService;

public class UserLoginServiceDemo {
    public static void main(String[] args) {
        UserLoginService service = new UserLoginService();
        User userVlad = new User("Vladislav", "332211");
        service.login(userVlad, "332211");

        User userVictor = new User("Victor", "vitya1234");
        service.login(userVictor, "123321");
        service.login(userVictor, "332211");
        service.login(userVictor, "vitya123");
        service.login(userVictor, "vitya1235");

        User userMax = new User("Max", "maxJavaGuru");
        service.login(userMax, "maxJava");
        service.login(userMax, "MaxGuru");
        service.login(userMax, "maxJavaGuru");
    }
}
