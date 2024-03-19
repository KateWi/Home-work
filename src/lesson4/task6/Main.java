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
        int[] array2 = new int[5]; //
        int index = 0;
        System.out.println("\n" + "Массив после замены нечётных индексов: ");
        for (int i = 0; i < array1.length; i++) {
            if (i % 2 > 0) {
                array2[index] = 0;
            } else {
                array2[index] = array1[i];
            }
            System.out.print(array2[index] + " ");
        }
    }
}