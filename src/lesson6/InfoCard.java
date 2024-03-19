package lesson6;

import java.util.Scanner;

public class InfoCard {
    public static void main(String[] args) {

        CreditCard card1 = new CreditCard();
        card1.accountNumber = "BY60BPSB1111A000000000011111";
        card1.accountAmount = 15400;
        CreditCard card2 = new CreditCard();
        card2.accountNumber = "BY60BPSB1111A000000000022222";
        card2.accountAmount = 45800;
        CreditCard card3 = new CreditCard();
        card3.accountNumber = "BY60BPSB1111A000000000033333";
        card3.accountAmount = 60800;
        System.out.println("На первую карту положить сумму, равную: ");
        Scanner sc = new Scanner(System.in);
        card1.sum = sc.nextInt();
        //card1.sum = 50;
        card1.addAmount(card1.sum);
        System.out.println("Текущее состояние первой карты: ");
        card1.info();
        System.out.println("На вторую карту положить сумму, равную: ");
        card2.sum = sc.nextInt();
        card2.addAmount(card2.sum);
        System.out.println("Текущее состояние второй карты: ");
        card2.info();
        System.out.println("С тетьей карты снять сумму, равную: ");
        card3.sum = sc.nextInt();
        card3.removeAmount(card3.sum);
        System.out.println("Текущее состояние третьей карты: ");
        card3.info();
    }
}
