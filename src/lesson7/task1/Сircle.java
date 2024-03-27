package lesson7.task1;

import lesson7.task1.Figure;

public class Сircle extends Figure {
    private double radius;
    public Сircle (double radius) {
        this.radius = radius;
    }

    @Override
    public double perimeter() {
        return 2 * 3.14 * radius;
    }
    @Override
    public double squareFigure(){
        return 3.14 * radius * radius;
    }
}
