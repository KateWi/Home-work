package lesson8.task1;

public class Test {
    public static void main(String[] args) {
        Phone phone1 = new Phone("375291144777", "Samsung", 0.5);
        Phone phone2 = new Phone("375441122333", "iOS");
        Phone phone3 = new Phone();
        System.out.println("Номер телефона " + phone1.getNumber());
        System.out.println("Номер телефона " + phone2.getNumber());
        System.out.println("Номер телефона " + phone3.getNumber());

        phone1.receiveCall (" Alex ", "375296655111");
        phone2.receiveCall (" Виктор ","375292277222");
        phone3.receiveCall (" Татьяна ","375293355333");
        phone1.sendMessage("375440011111", "375339988999");

    }
}