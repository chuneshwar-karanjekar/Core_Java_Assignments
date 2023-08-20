package assignment12;

import java.util.Scanner;

/**
 * Program1 print first 10 natural number
 */
public class Program1 {
public static void main(String[] args) {
    System.out.println("Enter your Nth Number :");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    for(int i=1; i<=num; i++){
        System.out.println(i);
    }
}
    
}