package lesson6;

import java.util.Scanner;

public class InfoCard {
    public static void main(String[] args) {

        CreditCard card1 = new CreditCard("BY60BPSB1111A000000000011111", 15400);
        CreditCard card2 = new CreditCard("BY60BPSB1111A000000000022222", 45800);
        CreditCard card3 = new CreditCard("BY60BPSB1111A000000000033333", 60800);
        card1.addAmount(500);
        card2.addAmount(1200);
        card3.removeAmount(70000);
        card1.cardInfo();
        card2.cardInfo();
        card3.cardInfo();
    }
}
