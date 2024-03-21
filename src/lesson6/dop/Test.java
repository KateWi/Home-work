package lesson6.dop;

public class Test {
    public static void main(String[] args) {
        Computer computer1 = new Computer(1000, "HP");
        System.out.println("computer1 info:");
        computer1.infAboutComp();
        System.out.println(" ");
        RAM ram2 = new RAM("DDR3", 16);
        HDD hdd2 = new HDD("HDD", 1000, "internal");
        Computer computer2 = new Computer(2500, "lenovo", ram2, hdd2);
        System.out.println("computer2 info:");
        computer2.infAboutComp();
    }
}
