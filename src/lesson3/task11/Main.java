package lesson3.task11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите сумму вклада");
        Scanner sc = new Scanner(System.in);
        float cont = sc.nextInt();
        System.out.println("Введите количество месяцев");
        int n = sc.nextInt();
        float sum = 0;
        for (int i = 1; i < n+1; i++)   {
            sum = cont + (float) (cont * 7 / 100);
            cont = sum;
            //System.out.println("Справочно:сумма за " + i + " месяц: " + sum);
            }
        System.out.println("конечная сумма вклада с учетом процентов:  " + sum);
    }
}