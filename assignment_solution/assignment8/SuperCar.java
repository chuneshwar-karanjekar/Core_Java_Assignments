package assignment8;

public class SuperCar{
     private  String ownerName, color,brand;
    private double price;
    // instance reference variable of a same class 
    private static SuperCar  ref;
// private constructor
    private SuperCar(){

    }
    // singleton 
    public static SuperCar getInstance(){
        if(ref == null){
            ref = new SuperCar();
            return ref;
        }
        return null;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public static SuperCar getRef() {
        return ref;
    }
    public static void setRef(SuperCar ref) {
        SuperCar.ref = ref;
    }

    

    public static void main(String[] args) {
        SuperCar s1 = SuperCar.getInstance();
        s1.setBrand("BMW");
        System.out.println(s1.getBrand());
        
    }
}


