package lesson6.dop;

public class HDD {

   private String name;
   private double volume;
    private String type;

    public HDD() {

    }

    public HDD(String name, double volume, String type) {
        this.name = name;
        this.volume = volume;
        this.type = type;
    }

    public void infAboutHDD() {
        System.out.println("HDD name: " + name);
        System.out.println("HDD volume: " + volume);
        System.out.println("HDD type: " + type);
    }
}

