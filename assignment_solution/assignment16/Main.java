package assignment16;

public class Main {
    public static void main(String[] args) {

        ThickCircle obj = new ThickCircle();
        obj.setRadius(3.4);
        obj.setThickness(4.5);
        System.out.println("Thickness Area :" + obj.getThicknessArea());
        System.out.println("Hollow Space Area :" + obj.hollowSpaceAreaOfCircle());
    }
}
