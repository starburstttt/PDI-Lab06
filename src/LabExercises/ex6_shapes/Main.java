package ex6_shapes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5.0));
        shapes.add(new Rectangle(4.0, 6.0));
        shapes.add(new Triangle(3.0, 8.0));

        for (Shape s : shapes) {
            System.out.printf("%s Area: %.2f%n", s.getClass().getSimpleName(), s.area());
        }
    }
}
