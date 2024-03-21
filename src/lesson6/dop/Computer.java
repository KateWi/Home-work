package lesson6.dop;

public class Computer {
    double price;
    String model;
    RAM ram;
    HDD hdd;

    public Computer(double price, String model) {
        this.price = price;
        this.model = model;
        this.ram = new RAM();
        this.hdd = new HDD();

    }

    public Computer(double price, String model, RAM ram, HDD hdd) {
        this.price = price;
        this.model = model;
        this.ram = ram;
        this.hdd = hdd;
    }

    public void infAboutComp() {
        hdd.infAboutHDD();
        ram.infAboutRAM();
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

