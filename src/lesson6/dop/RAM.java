package lesson6.dop;

public class RAM {
    private String name;
    private double volume;

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

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
