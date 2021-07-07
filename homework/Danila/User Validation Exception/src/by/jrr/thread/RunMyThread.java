package by.jrr.thread;

import by.jrr.bean.User;
import by.jrr.service.UserValidationService;

import java.util.LinkedList;
import java.util.List;

public class RunMyThread implements Runnable {
    @Override
    public void run() {
        List<User> userList = new LinkedList<>();

        userList.add(new User("Anton", "Kupreichik", (short)19));
        userList.add(new User("Vov4eg", "Vo@", (short)120));

        for (User entry: userList) {
            UserValidationService.validate(entry);
        }
    }
}
