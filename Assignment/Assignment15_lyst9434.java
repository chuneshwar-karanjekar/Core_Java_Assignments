package assignments;
import java.util.Scanner;
public class A15 {
    public void driver(){

    }
}

class Person{
    private String name;
    private int age;
    public Person(){
        name="Anonymous";
        age=0;
    }
    public Person(String name){
        this.name=name;
    }
    public Person(int age){
        this.age=age;
        name="Anonymous";
    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
}
class Employee1{
    private int empid;
    private String name;
    private double salary;
    private static int objectCount;
    private static int generateEmpid(){
        return objectCount+1;
    }
    public Employee1(){
        objectCount++;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of Employee");
        name=sc.nextLine();
        System.out.println("Enter Salary");
        salary=sc.nextDouble();
        empid=generateEmpid();
    }
    public Employee1(String name,double salary){
        objectCount++;
        empid=generateEmpid();
        this.name=name;
        this.salary=salary;
    }
}
class Box1{
    private int length, breadth, height;
    public Box1(){
        length=10;
        breadth=10;
        height=10;
    }
    public Box1(int side){
        length=side;
        breadth=side;
        height=side;
    }
    public Box1(int l,int b,int h){
        length=l;
        breadth=b;
        height=h;
    }
}
class Time1{
    private int hr,min,sec;
    public Time1(){

    }
    public Time1(int sec){
        this.sec=sec;
    }
    public Time1(int hr,int min,int sec){
        this.hr=hr;
        this.min=min;
        this.sec=sec;
    }
}
class Customer{
    private int id;
    private String name,mobile,email;
    public Customer(int id,String name,String mobile, String email){
        this.id=id;
        this.name=name;
        this.mobile=mobile;
        this.email=email;
    }
    public Customer(int id,String name,String mobile){
        this.id=id;
        this.name=name;
        this.mobile=mobile;
    }
}