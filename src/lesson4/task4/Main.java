package lesson4.task4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 100);
            System.out.print(array1[i] + " ");
        }
        System.out.println(" ");
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 100);
            System.out.print(array2[i] + " ");
        }
        System.out.println(" ");
        double avg1;
        int sum1 = 0;
        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
        }
        avg1 = (double) sum1 / array1.length;
        //System.out.println(avg1);
        double avg2;
        int sum2 = 0;
        for (int i = 0; i < array2.length; i++) {
            sum2 += array2[i];
        }
        avg2 = (double) sum2 / array2.length;
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
