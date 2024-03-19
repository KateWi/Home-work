package lesson6;

public class CreditCard {
    //public static void main(String[] args) {

    String accountNumber; //Номер счета
    double accountAmount; //сумма на счету
    double sum;

    void addAmount(double sum) {
        accountAmount += sum;
    }
    void info() {
        System.out.println(accountAmount);
    }
    void removeAmount(double sum) {
        accountAmount -= sum;
    }

    void cardInfo(String accountNumber, double accountAmount) {
        System.out.println("Текущая информация о карточке: ");
    }
}


