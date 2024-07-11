package Q2;

public class Demo {
    public static void main(String[] args) {
        Scalable[] shapes = {
                new Circle(5),
                new Ellipse(10, 5),
                new EquilateralTriangle(4),
                new Triangle(4, 3, 5)

        };
        System.out.println();
        System.out.println("\nBefore the Scaling:\n");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }

        System.out.println();

        scaleShapes(shapes, 2);

        System.out.println();
        System.out.println("\nAfter the Scaling:\n");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }

        System.out.println();
    }

    public static void scaleShapes(Scalable[] shapes, double factor) {
        for (Scalable shape : shapes) {
            shape.scale(factor);
        }
    }
}
