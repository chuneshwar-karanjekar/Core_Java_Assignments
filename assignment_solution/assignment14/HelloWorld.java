package assignment14;

import assignment15.EmployeeMain;

public class HelloWorld {
    public static void main(String[] args) {

        /*
         * calling box class methods volume and surface area
         * Box obj = new Box();
         * obj.setHeigth(12.89);
         * obj.setBreadth(11.23);
         * obj.setLength(5.67);
         * 
         * obj.calculateVolume();
         * obj.surfaceArea();
         */

        // calling EmployeeMain.java class from assignment 15
        EmployeeMain foo = new EmployeeMain();
        EmployeeMain foo1 = new EmployeeMain();

        /*
         * calling b1 class method
         * B1 foo = new B1();
         * B2 fo = new B2();
         * A1 a = new A1();
         * 
         * foo.b1Me();
         * fo.b2Me();
         * a.display();
         */
    }
}

/**
 * InnerHelloWorld
 */
class A1 {
    public void display() {
        System.out.println("this is A1 class.");
    }

}
