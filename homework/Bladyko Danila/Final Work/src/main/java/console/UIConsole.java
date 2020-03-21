package console;

import stat.Message;

public class UIConsole {
    public void mainMenu() {
        System.out.println("Hello!");
    }
    public void productNotFound() {
        System.out.println(Message.PRODUCT_NOT_FOUND_ID);
    }

}
