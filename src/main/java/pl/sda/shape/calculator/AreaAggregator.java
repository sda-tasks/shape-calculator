package pl.sda.shape.calculator;

public class AreaAggregator {

    public static void main(String[] args) {
        Shape circle = new Circle(10);
        Shape rectangle = new Rectangle(10, 20);
        Shape square = new Square(15);

        Shape[] shapes = {circle, rectangle, square};

        System.out.println(aggregate(shapes));
    }

    public static double aggregate(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum =+ shape.area();
        }
        return sum;
    }
}
