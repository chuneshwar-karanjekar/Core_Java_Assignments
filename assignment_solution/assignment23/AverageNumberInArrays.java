package assignment23;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AverageNumberInArrays {

    public void calculateAverage() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of the array :");
        int size = 0;
        boolean validInput = false;
        while (!validInput) {
            try {
                size = sc.nextInt();
                validInput = true;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }

        int arr[] = new int[size];
        Double sum = 0.0, avg = 0.0;

        System.out.println("Enter numbers :");
        for (int i = 0; i < size; i++) {
            validInput = false;
            while (!validInput) {
                try {
                    arr[i] = sc.nextInt();
                    sum = sum + arr[i];
                    validInput = true;
                } catch (InputMismatchException e) {
                    System.out.println(e.getMessage());
                    sc.nextLine();
                }
            }

        }

        avg = sum / size;
        System.out.println(sum + " Average of array element is :" + avg);

    }

    public static void main(String[] args) {
        AverageNumberInArrays a = new AverageNumberInArrays();
        a.calculateAverage();
    }
}
