package lesson6.dop;

public class RAM {
    String name;
    double volume;

    public RAM() {

    }

    public RAM(String name, double volume) {
        this.name = name;
        this.volume = volume;
    }

    public void infAboutRAM() {
        System.out.println("RAM name: " + name);
        System.out.println("RAM volume: " + volume);
    }
}
