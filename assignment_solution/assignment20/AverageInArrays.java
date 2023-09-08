package assignment20;

import java.util.Scanner;

public class AverageInArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int size = sc.nextInt();
        System.out.println("Enter element of array :");
        int arr[] = new int[size];

        int n = arr.length;
        int avg = 0, sum = arr[0];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }
        avg = sum / n;
        System.out.println("sum is " + sum + " and Average is :" + avg);
    }

}
