package assignment17;

import java.lang.Math;

public class Coordinate {
    private double x, y;

    public Coordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance() {
        return Math.sqrt(x * x + y * y);
    }

    public double getDistance(Coordinate p2) {
        return Math.sqrt((x - p2.x) * (x - p2.x) + (y - p2.y) * (y - p2.y));
    }

    public static void main(String[] args) {
        Coordinate foo = new Coordinate(3, 5);

        System.out.println(foo.getDistance());
        System.out.println(foo.getDistance(foo));

    }
}
