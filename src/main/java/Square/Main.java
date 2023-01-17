package Square;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Shape> shapes = new ArrayList<Shape>();

        shapes.add(new Square(5));
        shapes.add(new Circle(3));
        shapes.add(new Square(4));
        shapes.add(new Circle(5));


        for (Shape shape : shapes) {
                System.out.println("Area: " + shape.getArea());

        }
    }
}
