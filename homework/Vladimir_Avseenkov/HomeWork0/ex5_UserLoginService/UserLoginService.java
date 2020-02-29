package Vladimir_Avseenkov.HomeWork0.ex5_UserLoginService;

import java.util.Scanner;

public class UserLoginService {

    public static void main(String[] args) {
        User userVov4eg = new User("Vov4eg", "Intens1ve!");
        User userSomeone = new User("Someone", "o4en' silnyy parol'");
        Scanner input = new Scanner(System.in);
        userVov4eg.userLogin(userVov4eg.userName, "123456");
        userVov4eg.userLogin(userVov4eg.userName, "qwerty");
        userVov4eg.userLogin(userVov4eg.userName, "1q2w3e4r5t");
        userVov4eg.resetLoginCount();
        userVov4eg.userLogin(userVov4eg.userName, userVov4eg.password);
        userVov4eg.setBlocked(true);
        userVov4eg.userLogin(userVov4eg.userName, userVov4eg.password);
        userSomeone.userLogin(userSomeone.userName, userSomeone.password);



    }

}
