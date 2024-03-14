package lesson4.task9;

import java.util.Random;
import java.util.Scanner;

public class Diag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.print("Введите n размерность массива array n*m: ");
        while (!sc.hasNextInt()) {
            System.out.println("Ошибка. Введите целое число.");
            sc.next();
        }
        int n = sc.nextInt();
        System.out.print("Введите m размерность массива array n*m: ");
        while (!sc.hasNextInt()) {
            System.out.println("Ошибка. Введите целое число.");
            sc.next();
        }
        int m = sc.nextInt();
        int D = 0;
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] =  r.nextInt(100);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Главная диагональ массива: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i == j) {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("Побочная диагональ массива: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j == m - 1) {
                    m--;
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
