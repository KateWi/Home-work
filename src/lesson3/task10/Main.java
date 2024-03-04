package lesson3.task10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int f = 0;
        int s = 1;
        System.out.println("Сколько чисел Фибоначчи выводить?");
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
        System.out.print("Первые " + n + " чисел последовательности Фибоначчи: ");
        System.out.print(f + " " + s);
        int i = 1;
        while (i < n-1)
        {
            int sum = f + s;
            f = s;
            s = sum;
            System.out.print(" " + sum);
            i++;
        }

    }
}