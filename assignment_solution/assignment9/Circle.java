package assignment9;
import java.util.*;
public class Circle {
	 //int radius;
	Integer  radius ;
	
	void setRadius(int r) {
		radius =r;
	}
	void getRadius() {
		System.out.println("Radius :"+radius);
	}
	void getArea() {
		System.out.println("Area :"+3.14*(radius*radius));
	}
	void getCircumferene() {
		System.out.println("Circumferene :"+2*3.14*radius);
	}
	public static void main(String[] args) {
		Circle c = new Circle();
		c.setRadius(9);
		c.getRadius();
		c.getArea();
		c.getCircumferene();
	}
}
