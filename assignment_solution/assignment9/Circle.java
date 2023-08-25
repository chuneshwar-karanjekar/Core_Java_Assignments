package assignment9;

public class Circle {
	 //int radius;
	private Double radius ;
	
	public void setRadius(Double r) {
		this.radius =r;
	}
	void getRadius() {
		System.out.println("Radius :"+radius);
	}
	public Double getArea() {
		return 3.14*(radius*radius);
	}
	void getCircumferene() {
		System.out.println("Circumferene :"+2*3.14*radius);
	}
	public static void main(String[] args) {
		Circle c = new Circle();
		c.setRadius(5.6);
		c.getRadius();
		c.getArea();
		c.getCircumferene();
	}
}
