package lesson3.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        if (g % 2 == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное число");
        }
    }
}    

