package lesson3.task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int f = 1;
        int s = 0;
        System.out.println("Сколько чисел Фибоначчи выводить?");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("Первые " + n + " чисел последовательности Фибоначчи: ");
        //System.out.print(f + " " + s);
        int i = 0;
        int sum = 0;
        while (i < n) {
            System.out.print(" " + sum);
            sum = f + s;
            f = s;
            s = sum;
            i++;
        }
    }
}
