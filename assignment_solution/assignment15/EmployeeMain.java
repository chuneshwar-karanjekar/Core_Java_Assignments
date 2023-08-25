package assignment15;

import java.util.Scanner;

class parent{
      void weekend(){
        System.out.println("hello world");
    }
}
class child extends parent{
    void weekend(){
        System.out.println("hello world"+ " "+ "spring boot");
    }

}
public class EmployeeMain {
    
    public static void main(String[] args) {
        child foo = new child();
        foo.weekend();
     
    }
}
