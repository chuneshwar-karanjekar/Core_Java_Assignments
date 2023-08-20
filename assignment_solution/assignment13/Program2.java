package assignment13;

import java.util.Scanner;

public class Program2 {
    private int a,b,c;

    public void setNum(int a,int b, int c){
        this.a =a;
        this.b = b;
        this.c = c;
    }
    public void getNum(){
        if(a>b && a>c)
            System.out.println("a :"+a); 
        else if(b>a && b>c)
           System.out.println("b :"+b);
        else if(c>a && c>b)
            System.out.println("c :"+c);
        else
       System.out.println("no one greater.");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Three Number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Program2 obj = new Program2();
        obj.setNum(a,b,c);
        obj.getNum();
    }
}
