public class Triangle extends Shape {
    private final double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        super("Triangle");
        if (!isValidTriangle(side1, side2, side3)) {
            throw new IllegalArgumentException("Invalid side lengths for a triangle.");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    private boolean isValidTriangle(double side1, double side2, double side3) {
        return side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}