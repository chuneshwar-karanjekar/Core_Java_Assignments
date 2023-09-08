package assignments;
import java.lang.*;
public class A17 {

    public void driver() {
        Coordinate p1=new Coordinate(2,3);
        System.out.println("Distance from origin: "+String.format("%.3f",p1.getDistance()));
        Coordinate p2=new Coordinate(4,-3);
        System.out.println("Distance between two points: "+p1.getDistance(p2));

    }
}
class Coordinate{
    int x,y;
    public Coordinate(int x,int y){
        this.x=x;
        this.y=y;
    }
    public double getDistance(){
        return java.lang.Math.sqrt(x*x+y*y);
    }
    public double getDistance(Coordinate p2){
        return java.lang.Math.sqrt((x-p2.x)*(x-p2.x)+(y-p2.y)*(y-p2.y));
    }
}
class Rectangle{
    int length, breadth;
    String borderColour;
    public void setLength(int l){
        length=l;
    }
    public void setBreadth(int b){
        breadth=b;
    }
    public void setBorderColour(String c){
        borderColour=c;
    }
    public int getLength(){
        return length;
    }
    public int getBreadth(){
        return breadth;
    }
    public String getBorderColour(){
        return borderColour;
    }
    public void printRectangleColour(){
        System.out.println("Border Colour"+borderColour);
    }

}
class FilledRectangle extends Rectangle{
    String fillColour;

    public String getFillColour() {
        return fillColour;
    }

    public void setFillColour(String fillColour) {
        this.fillColour = fillColour;
    }
    public void printRectangleColour(){
        System.out.println("Filled Colour: "+fillColour);
        super.printRectangleColour();
    }
}

class Person2{
    String name;
    int age;
    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void showName(){
        System.out.println("Name: "+name);
    }
    public void showName(String title){
        System.out.println(title+" "+name);
    }

    public void setPerson(String n){
        name=n;
    }
    public void setPerson(int a){
        age=a;
    }
    public void setPerson(String n, int a){
        name=n;
        age=a;
    }
}
class Circle3{
    private int radius;
    public void setRadius(int r){
        radius=r;
    }
    public int getRadius(){
        return radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
}
class ThickCircle1 extends Circle3{
    private int thickness;
    public void setThickness(int t){
        thickness=t;
    }
    public int getThickness(){
        return thickness;
    }
    public double getArea(){
        return 3.14*(getRadius()+thickness)*(getRadius()+thickness)-super.getArea();
    }

}