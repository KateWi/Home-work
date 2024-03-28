package lesson3.task5;

import java.util.Scanner;

public class Main  {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int g = sc.nextInt();
        switch (g) {
            case 1:
                System.out.println ("Красный");
                break;
            case 2:
                System.out.println ("Оранжевый");
                break;
            case 3:
                System.out.println ("Жёлтый");
                break;
            case 4:
                System.out.println ("Зелёный");
                break;
            case 5:
                System.out.println ("Голубой");
                break;
            case 6:
                System.out.println ("Синий");
                break;
            case 7:
                System.out.println ("Фиолетовый");
                break;
            default:
                System.out.println ("Invalid number");
        }
    }
}
