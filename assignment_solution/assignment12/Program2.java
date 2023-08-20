package assignment12;

import java.util.Scanner;
/*
 * print n natural number in revers order
 */

public class Program2 {
    public static void main(String[] args) {
        System.out.println("Enter your Nth Number :");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for(int i=num; i>=1; i--){
        System.out.println(i);
    }
    }
}
