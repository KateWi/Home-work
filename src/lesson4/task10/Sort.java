package lesson4.task10;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random ();
        int n = 0;
        int m = 0;
        System.out.print("Введите n размерность массива array n*m: ");
        if (sc.hasNextInt ()) {
            n = sc.nextInt();
            m = sc.nextInt();
        }
        int mass [][] = new int [n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                mass [i][j] = r.nextInt(100);
            }
        }
        for (int i = 0; i < n; i++) {
            Arrays.sort(mass[i]);
            for (int j = 0; j < m; j++) {
                System.out.print(mass[i][j] + " ");

            }
            System.out.println();
        }

    }
}
