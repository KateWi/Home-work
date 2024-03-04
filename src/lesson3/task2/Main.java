package lesson3.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        if ((g < 3 & g > 0) | (g == 12)) {
            System.out.println("Winter");
        } else if (g > 2 & g < 6) {
            System.out.println("Spring");
        } else if (g > 5 & g < 9) {
            System.out.println("Summer");
        } else if (g > 8 & g < 12) {
            System.out.println("Autumn");
        } else {
            System.out.println("Invalid month number");
        }
    }
}