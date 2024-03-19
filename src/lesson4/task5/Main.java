package lesson4.task5;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int n;
        do {
            System.out.print("Введите размер массива array (5 < array ≤ 10) : ");
            while (!sc.hasNextInt()) {
                System.out.println("Ошибка. Введите целое число.");
                sc.next();
            }
            n = sc.nextInt();
            if (n <= 5 || n > 10) {
                System.out.println("Число не соответствует диапазону ввода");
            }
        } while (n <= 5 || n > 10);

        //System.out.println("Введенное число: " + n);
        int[] array1 = new int[n];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = r.nextInt(100);
            System.out.print(array1[i] + " ");
        }
        int count = 0; //Длина нового массива
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                count++;
            }
        }
        //System.out.println("\n Количество элементов массива " + count + " " + "\n");
        System.out.println("\n Второй массив из чётных элементов: " + " " + "\n");
        int[] array2 = new int[count];
        int index = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 0) {
                array2[index] = array1[i];
                System.out.print(array2[index] + " ");
            } else {
                i = i;
            }
        }
    }
}
