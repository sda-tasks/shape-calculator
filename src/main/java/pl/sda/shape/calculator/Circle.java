package pl.sda.shape.calculator;

public class Circle implements Shape {

    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double area() {
        return r*r * Math.PI;
    }
}
