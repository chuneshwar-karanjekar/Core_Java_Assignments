package assignment18;

public class Circle {
    private double radius;
    private static final double PI;
    {
        radius = 5;
    }
    static {
        PI = 3.14;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Circle foo = new Circle();
        System.out.println("Area is :" + foo.getArea());

    }
}
