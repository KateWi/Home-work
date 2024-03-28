package lesson8.task1;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone() {

    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит" + name);
    }

    public String getNumber() {
        return (number);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит" + name + " номер телефона:" + number);
    }

    public void sendMessage(String... numberSMS) {
        for (String num : numberSMS) {
            System.out.println("Номер телефона, на который отправлено sms: " + num);
        }
    }
}
