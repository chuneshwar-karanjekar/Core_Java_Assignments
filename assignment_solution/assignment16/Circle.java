package assignment16;

// call this class from main.java class
public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return (3.14 * (radius * radius));
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

    public double hollowSpaceAreaOfCircle() {
        return 3.14 * ((getRadius() + thickness) * (getRadius() - thickness));
    }

    public double getThicknessArea() {
        return calculateArea();
    }

}
