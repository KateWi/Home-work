package lesson6;

public class CreditCard {
    String accountNumber; //Номер счета
    double accountAmount; //сумма на счету

    public CreditCard(String accountNumber, double accountAmount) {
        this.accountNumber = accountNumber;
        this.accountAmount = accountAmount;
    }

    //double sum;
    public void addAmount(double sum) {
        accountAmount += sum;
    }

    public void removeAmount(double sum) {
        if (accountAmount >= sum) {
            accountAmount -= sum;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void cardInfo() {
        System.out.println("Текущая информация о карточке, номер счета : " + accountNumber);
        System.out.println("Сумма на счету: " + accountAmount);
    }
}


