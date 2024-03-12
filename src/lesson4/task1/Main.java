package lesson4.task1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt();
            System.out.println(array[i]);
        }

        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        //for (int i : array) {
        int a = 0;
        for (int j : array) {
            if (j == g) {
                System.out.println("Введённое число есть в массиве");
                a++;
            }
        }
        if (a == 0) {
            System.out.println("Введённого числа нет в массиве");
        }
    }
}


