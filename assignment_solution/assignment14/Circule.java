package assignment14;

public class Circule {
    private double radius;
    double calculateArea, circumference;

     public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getCalculateArea() {
        return calculateArea;
    }
    public void setCalculateArea(double calculateArea) {
        this.calculateArea = calculateArea;
    }
    public double getCircumference() {
        return circumference;
    }
    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    public void display(){
        System.out.println("Area :"+(3.14)*radius*radius);
        System.out.println("circumference :"+(3.14)*radius*2);
    }
   
    

    
}
