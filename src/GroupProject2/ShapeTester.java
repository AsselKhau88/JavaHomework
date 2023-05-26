package GroupProject2;

public class ShapeTester {
    public static void main(String[] args) {
        Shape[] shapes = {new Circle(2), new Square(5, 5)};
        for (Shape shape : shapes) {

            shape.calculatePerimeter();
            shape.calculateArea();
        }
    }
}