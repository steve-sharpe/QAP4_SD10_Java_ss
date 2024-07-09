package Q2;

public class Ellipse extends Shape implements Scalable {
    private double axis1;
    private double axis2;

    public Ellipse(double axis1, double axis2) {
        this.axis1 = axis1;
        this.axis2 = axis2;
    }

    @Override
    public void draw() {
        System.out.println("Drawing an Ellipse with a major axis of " + axis1 + " and a minor axis of " + axis2);
    }

    @Override
    public void scale(double factor) {
        axis1 *= factor;
        axis2 *= factor;
    }

    @Override
    public String toString() {
        return "Ellipse with a major axis of " + axis1 + " and a minor axis of " + axis2;
    }
}