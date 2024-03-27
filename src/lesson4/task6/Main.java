package lesson4.task6;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array1 = new int[5];
        Random r = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = r.nextInt(100);
            System.out.print(array1[i] + " ");
        }
        System.out.println("\n" + "Массив после замены нечётных индексов: ");
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 > 0) {
                array1[i] = 0;
            }
            System.out.print(array1[i] + " ");
        }
    }
}