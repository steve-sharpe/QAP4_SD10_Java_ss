public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    @Override
    public String toString() {
        return String.format("Shape Type: %s, Perimeter: %.2f, Area: %.2f", name, getPerimeter(), getArea());
    }
}