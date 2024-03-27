package lesson7.task1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Figure[] array = new Figure[5];
        double AllPerimetr = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Укажите тип фигуры: 1 - прямоугольник, 2 - квадрат, 3 - круг ");
            Scanner scanner = new Scanner(System.in);
            int type = scanner.nextInt();
            switch (type) {
                case 1:
                    System.out.println("Укажите длину и ширину: ");
                    double length = scanner.nextInt();
                    double width = scanner.nextInt();
                    array[i] = new Rectangle(length, width);
                    break;
                case 2:
                    System.out.println("Укажите длину : ");
                    double len = scanner.nextInt();
                    array[i] = new Square(len);
                    break;
                case 3:
                    System.out.println("Укажите радиус : ");
                    double radius = scanner.nextInt();
                    array[i] = new Square(radius);
                    break;
                default:
                    System.out.println("Введено неверное значение ");
                    break;
            }
            AllPerimetr += array[i].perimeter();
        }
        System.out.println(AllPerimetr);
    }
}
