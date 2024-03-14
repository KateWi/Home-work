package lesson4.task2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[8];
        int count = 0;
        int index = 0;
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        for (int j : array) {
            if (j != g) {
                count++;
            }
        }
        if (count < array.length) {
            System.out.println("Введённого числа нет в массиве");
        }
        //System.out.println(count);//Длина нового массива
        int[] b = new int[count];
        for (int i = 0; i < array.length; i++) {
            if (array[i] != g) {
                b[index] = array[i];
                System.out.print(b[index] + " ");
            } else {
                i = i;
            }
        }
    }
}
