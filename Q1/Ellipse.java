public class Ellipse extends Shape {
    private final double majorAxis;
    private final double minorAxis;

    public Ellipse(double axis1, double axis2) {
        super("Ellipse");
        this.majorAxis = Math.max(axis1, axis2);
        this.minorAxis = Math.min(axis1, axis2);
    }

    @Override
    public double getPerimeter() {
        return Math.PI * 2 * Math.sqrt((majorAxis * majorAxis + minorAxis * minorAxis) / 2.0);
    }

    @Override
    public double getArea() {
        return Math.PI * majorAxis * minorAxis;
    }
}