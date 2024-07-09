public class Demo {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(5),
                new Ellipse(3, 6),
                new EquilateralTriangle(6),
                new Triangle(5, 6, 8)

        };

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}