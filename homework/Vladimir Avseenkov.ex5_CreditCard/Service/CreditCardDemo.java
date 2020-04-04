package Service;

import bean.CreditCard;

public class CreditCardDemo {
    public static void main(String[] args) {
        CreditCard card = new CreditCard( "1234 5678 9012 3456", "0000");
        card.setLoanLimit(100);
        System.out.println(card.toString());

        System.out.println("Неправильный пин: ");
        card.deposit(5, "1111");

        card.deposit(5, "0000");
        System.out.println("Кладём 5 \n" + card.toString());

        card.withdraw(10, "0000");
        System.out.println("Снимаем 10 \n" + card.toString());

        System.out.println("Пробуем снять больше положенного: ");
        card.withdraw(100, "0000");

        card.deposit(15, "0000");
        System.out.println("Кладём 15 \n" + card.toString());
    }
}
