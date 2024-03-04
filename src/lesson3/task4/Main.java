package lesson3.task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if (t > -5) {
            System.out.println("Тепло");
        } else if ( t > -20) {
            System.out.println("Нормально");
        } else {
            System.out.println("Холодно");
        }

    }
}