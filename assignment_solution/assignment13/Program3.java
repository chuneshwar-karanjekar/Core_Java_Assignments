package assignment13;

import java.util.Scanner;

/**
 * Program3
 */
public class Program3 {
    private int number;

    public void getNum(int number){
        this.number = number;
    }

    public void setNum(){
        int count =0;
       while (number !=0) {
        number = number / 10;
        count += 1;
       }
        System.out.println("Total count of Number :"+count);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Number Here :");
        int number = sc.nextInt();

        Program3 obj = new Program3();
        obj.getNum(number);
        obj.setNum();

    }
}