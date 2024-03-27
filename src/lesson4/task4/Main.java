package lesson4.task4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        Random r = new Random();
        for (int i = 0; i < array1.length; i++) {
            array1[i] = r.nextInt(100);
            array2[i] = r.nextInt(100);
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        double avg1;
        double avg2;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
            sum2 += array2[i];
        }
        avg1 = (double) sum1 / array1.length;
        avg2 = (double) sum2 / array2.length;

        //System.out.println(avg1);
        //System.out.println(avg2);
        if (avg1 > avg2) {
            System.out.print("Среднее арифметическое первого массива больше и равно: " + avg1);
        } else if (avg1 == avg2) {
            System.out.print("Средние арифметические значения двух массивов равны  " + avg1);
        } else {
            System.out.print("Среднее арифметическое второго массива больше и равно: " + avg2);
        }
    }
}
