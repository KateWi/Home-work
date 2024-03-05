package lesson3.task7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите целое положительное число:");
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        int i = 0;
        int sum = 0;
        if (g > 0) {
            while (i <  g) {
                sum = sum + g;
               // System.out.println("Сумма: " + sum);
                g--;
            }
            System.out.println("Сумма: " + sum);
        }
        else {System.out.println("Введено неверное число");
        }
    }
}
