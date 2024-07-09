package Q2;

public class EquilateralTriangle extends Triangle {
    private double side;

    public EquilateralTriangle(double side) {
        super(side, side, side);
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Equilateral  Triangle with  3 equal sides measuring:  " + side);
    }

    @Override
    public void scale(double factor) {
        side = side * factor;
    }

    @Override
    public String toString() {
        return "Equilateral Triangle with sides equal to " + side;
    }

}