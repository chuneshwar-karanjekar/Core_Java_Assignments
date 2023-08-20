package world;
import java.util.Scanner;
public class HelloWorld {
    public static void main(String []args){
        f3();

    }
    public static void f1(){
        int i,j;
        for(i=1;i<=5;i++) {
            for(j=1;j<=5;j++){
                if(j<=i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void f2(){
        int i,j;
        for(i=1;i<=5;i++) {
            for(j=1;j<=5;j++){
                if(j>=6-i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void f3(){
        int i,j;
        for(i=1;i<=5;i++) {
            for(j=1;j<=5;j++){
                if(j<=6-i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void f4(){
        int i,j;
        for(i=1;i<=5;i++) {
            for(j=1;j<=5;j++){
                if(j>=i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void f5(){
        int i,j,k;
        for(i=1;i<=5;i++) {
            k=1;
            for(j=1;j<=5;j++){
                if(j<=i)
                    System.out.print(k++);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void f6(){
        int i,j,k;
        for(i=1;i<=4;i++) {
            k=i;
            for(j=1;j<=4;j++){
                if(j<=i)
                    System.out.print(k--);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void f7(){
        int i,j;
        char k;
        for(i=1,k=1;i<=5;i++) {
            k='A';
            for(j=1;j<=5;j++){
                if(j>=i)
                    System.out.print(k++);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void f8(){
        int i,j,k;
        for(i=1,k=1;i<=4;i++) {
            for(j=1;j<=4;j++){
                if(j<=i)
                    System.out.print(k++);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void f9(){
        int i,j;
        char k;
        for(i=1,k=1;i<=5;i++) {
            k=(char)(64+i);
            for(j=1;j<=5;j++){
                if(j>=i)
                    System.out.print(k++);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void f10()
    {
        int i,j;
        for(i=1;i<=5;i++) {
            for(j=1;j<=5;j++){
                if(i==1||i==5||j==1||j==5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
