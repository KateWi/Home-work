package lesson4.task2;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[8];
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println("Введите число:");
        Scanner sc = new Scanner(System.in);
        int g = sc.nextInt();
        boolean flag = false;
        for (int i : array) {
            if (i == g) {
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("Введённого числа нет в массиве");
        } else {
            int count = 0;
            for (int i : array) {
                if (i != g) {
                    count++;
                }
            }
            int[] newArray = new int[count];
            int index = 0;
            for (int j : array) {
                if (j != g) {
                    newArray[index] = j;
                    System.out.print(newArray[index] + " ");
                }
            }
        }
    }
}

