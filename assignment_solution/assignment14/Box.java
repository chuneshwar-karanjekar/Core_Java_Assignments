package assignment14;
// call this class method in hello word class 
public class Box {
    private double length, breadth, heigth;
    protected double volume, surfaceArea;

    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getBreadth() {
        return breadth;
    }
    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    public double getHeigth() {
        return heigth;
    }
    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }
    public double getSurfaceArea() {
        return surfaceArea;
    }
    public void setSurfaceArea(double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public void calculateVolume(){
        double result = length * breadth *heigth;
        System.out.println("volume of box is :"+result);
    }
    
    public void surfaceArea(){
        double sArea = 2*(length * breadth)+ 2*(heigth *breadth)+ 2*(heigth*length);
        System.out.println("surface area of box is : " +sArea);
    }
}
