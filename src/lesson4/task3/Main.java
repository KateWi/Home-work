package lesson4.task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length ");
        int[] array = new int[sc.nextInt()];
        System.out.print(" Цикл: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        int max = 0;
        int min = array[0];
        double sum = 0;
        for (int j : array) {
            if (max < j) {
                max = j;
            }
            if (min > j) {
                min = j;
            }
            sum += j;
        }
        System.out.println("\n" + "Максимальное, минимальное, среднее значения: " + "\n");
        double avg = sum / array.length;
        System.out.print(max + " " + min + " " + avg);
    }
}
