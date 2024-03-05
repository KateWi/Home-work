package lesson3.task1;

import java.util.Scanner;

public class Main  {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int g = sc.nextInt();
        switch (g) {
            case 1:
                System.out.println ("Winter");
                break;
            case 2:
                System.out.println ("Winter");
                break;
            case 3:
                System.out.println ("Spring");
                break;
            case 4:
                System.out.println ("Spring");
                break;
            case 5:
                System.out.println ("Spring");
                break;
            case 6:
                System.out.println ("Summer");
                break;
            case 7:
                System.out.println ("Summer");
                break;
            case 8:
                System.out.println ("Summer");
                break;
            case 9:
                System.out.println ("Autumn");
                break;
            case 10:
                System.out.println ("Autumn");
                break;
            case 11:
                System.out.println ("Autumn");
                break;
            case 12:
                System.out.println ("Winter");
                break;
            default:
                System.out.println ("Invalid month number");
        }
    }
}
