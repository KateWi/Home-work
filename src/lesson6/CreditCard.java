package lesson6;

public class CreditCard {
    public String accountNumber; //Номер счета
    public double accountAmount; //сумма на счету

    public CreditCard(String accountNumber, double accountAmount) {
        this.accountNumber = accountNumber;
        this.accountAmount = accountAmount;
    }

    //double sum;
    public void addAmount(double sum) {
        accountAmount += sum;
    }

   // public double removeAmount() {
     //   return removeAmount(0.0);
   // }

    public double removeAmount(double sum) {
        if (accountAmount >= sum) {
            accountAmount -= sum;
        } else {
            System.out.println("Insufficient funds");
        }
        return accountAmount;
    }

    public void cardInfo() {
        System.out.println("Текущая информация о карточке, номер счета : " + accountNumber);
        System.out.println("Сумма на счету: " + accountAmount);
    }
}


