package assignment20;

import java.util.Scanner;

public class InputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int num = sc.nextInt();
        int arr[] = new int[num];
        System.out.println("Enter array number :");

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            System.out.print(" " + arr[i]);
        }

    }
}
