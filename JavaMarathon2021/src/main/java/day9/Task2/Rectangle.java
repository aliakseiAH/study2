package day9.Task2;

public class Rectangle extends Figure{
    private double x,y;

    public Rectangle(String color, double a, double b) {
        super(color);
        this.x = a;
        this.y = b;
    }

    @Override
    public double perimeter() {
        return ((x+y)*2);
    }

    @Override
    public double area() {
        return (x*y);
    }
}
