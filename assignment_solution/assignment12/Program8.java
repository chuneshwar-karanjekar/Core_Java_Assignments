package assignment12;

import java.util.Scanner;

/*
 * print n natural squres 
 */
public class Program8 {
    public static void main(String[] args) {
        System.out.println("Enter your Nth Number :");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for(int i=1; i<=num; i++){
        System.out.println(i*i);
    }
    }
}
