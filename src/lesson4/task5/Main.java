package lesson4.task5;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Введите размер массива array (5 < array ≤ 10) : ");
        int n = sc.nextInt();
        while (n <= 5 || n > 10) {
            System.out.println("Число не соответствует диапазону ввода");
            n = sc.nextInt();
        }
        int[] array1 = new int[n];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = r.nextInt(100);
            System.out.print(array1[i] + " ");
        }
        int count = 0; //Длина нового массива
        for (int k : array1) {
            if (k % 2 == 0) {
                count++;
            }
        }
        //System.out.println("\n Количество элементов массива " + count + " " + "\n");
        System.out.println("\n Второй массив из чётных элементов: " + " " + "\n");
        int[] array2 = new int[count];
        int index = 0;
        for (int j : array1) {
            if (j % 2 == 0) {
                array2[index] = j;
                System.out.print(array2[index] + " ");
            }
        }
    }
}