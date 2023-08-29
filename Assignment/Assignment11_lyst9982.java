package assignments;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.lang.Math;
public class A11 {

    public void driver(){
        A11.printDate();
        A11.printTime();
        A11.printRandom();
        A11.calculateRoots(1,-5,6);
    }
    public static void printDate(){
        LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter f=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(f.format(now));
    }
    public static void printTime(){
        LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter f=DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println(f.format(now));
    }
    public static void printRandom(){
        double d1=Math.random()*100+100;
        System.out.println((int)d1);
    }
    public static void calculateRoots(int a,int b,int c){
        double x1,x2;
        x1=(-b+Math.sqrt(b*b-4*a*c))/(2*a);
        x2=(-b-Math.sqrt(b*b-4*a*c))/(2*a);
        System.out.println("Root 1="+x1+"Root 2="+x2);
    }
}
