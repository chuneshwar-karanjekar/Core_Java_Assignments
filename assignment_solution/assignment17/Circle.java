package assignment17;

// call this class from main.java
class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return 2 * radius * radius;

    }
}

class ThickCircle extends Circle {
    private double thickness;

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    @Override
    public double getArea() {
        System.out.println("This is Sub class Method :");
        return 3.14 * (getRadius() + thickness) * (getRadius() + thickness) - super.getArea();
    }

}
