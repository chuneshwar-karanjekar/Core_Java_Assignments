package assignment14;

public class HelloWorld {
    public static void main(String[] args) {
        B1 foo = new B1();
        B2 fo = new B2();
        A1 a = new A1();

        foo.b1Me();
        fo.b2Me();
        a.display();    
        
    }
}

/**
 * InnerHelloWorld
 */
 class A1 {
    public void display(){
        System.out.println("this is A1 class.");
    }
    
}
