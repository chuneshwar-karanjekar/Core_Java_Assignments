package assignments;

public class A18 {
    public void driver() {


    }
}
class Circle4{
    private float radius;
    private static final double PI;
    {
        radius=5;
    }
    static{
        PI=3.14;
    }
    public void setRadius(float radius){
        this.radius=radius;
    }
    public float getRadius(){
        return radius;
    }
    public double getArea(){
        return PI*radius*radius;
    }

}
class Person3{
    private String name;
    private int age;
    public Person3(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Person3(){
        this("Anonymous",25);
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

}
class Employee3 extends Person3{
    private double salary;
    public Employee3(){
        this(10000.0);
    }
    public Employee3(double salary){
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
    public void showEmployee(){
        System.out.println(getName()+" "+getAge()+" "+getSalary());
    }
}

class A{
     int x; //Instance variable in super class
    public void f2(){

    }
}
class B extends A{
    private int x; //Instance variable in sub class
    public void f1(){
        int x=5; //local variable
        System.out.println(x); //local variable x
        System.out.println(this.x); //Instance variable of class B (subclass)
        System.out.println(super.x);
    }
    public void f2(){
        super.f2(); //Invoking super class version of f2() method
    }
}
