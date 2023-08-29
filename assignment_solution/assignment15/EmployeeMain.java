package assignment15;
import java.util.Scanner;

// call this class in assignment 14 HelloWord.java 
public class EmployeeMain {
    private int empid;
    private String name;
    private double salary;
    private static int value =0;

    static{
        value += 1;
    }
   
    private int generateID(){
        empid=value++;
        return empid++;
    }
    public EmployeeMain(){
            
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of Employee");
        name=sc.nextLine();
        System.out.println("Enter Salary");
        salary=sc.nextDouble();
        System.out.println("id :"+generateID()); 
       
    }
    public EmployeeMain(String name, double salary){

        this.name = name;
        this.salary = salary;
    }

}

// this is assignment 15 question no 4
class Time{
    private int hr, min, sec;

    public Time(){

    }
    public Time(int hr, int min){
        this.hr =hr;
        this.min = min;
    }
    public Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
    }

}

// this is question no 5

 class InnerEmployeeMain {
    private int id, phone;
    private String name,email;

    public InnerEmployeeMain(){

    }
    public InnerEmployeeMain(int id, int phone, String name, String email) {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.email = email;
    }
    
}