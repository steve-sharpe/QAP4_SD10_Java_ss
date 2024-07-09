package Q2;

public class Circle extends Shape implements Scalable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Circle with a radius equal to: " + radius);
    }

    @Override
    public void scale(double factor) {
        radius *= factor;
    }

    @Override
    public String toString() {
        return "Circle with radius: " + radius;
    }
}