package assignment12;

import java.util.Scanner;

/*
 * print table of natural number
 */
public class Program10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(num+" * "+i+" = "+num*i);
        }
    }
}
