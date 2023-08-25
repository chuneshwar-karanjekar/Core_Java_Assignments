package assignment13;

import java.util.Scanner;

public class Program1 {

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter your Input :");
        int input = sc.nextInt();

        if (input%2==0) {
            System.out.println("number is Even .");
        }
        else
        System.out.println("Input is Odd .");
    }
}
