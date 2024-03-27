package lesson7.task1;

public class Rectangle extends Figure {
    public double length;
    public double width;

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public double squareFigure() {
        return length * width;
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle(double len) {
        length = width = len;
    }
}
