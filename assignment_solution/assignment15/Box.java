package assignment15;

import java.util.Scanner;

public class Box {
    private int length, breadth, heigth;

    public Box() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length :");
        length = sc.nextInt();
        System.out.println("Enter breadth :");
        breadth = sc.nextInt();
        System.out.println("Enter heigth :");
        breadth = sc.nextInt();
    }

    public Box(int length) {
        this.length = length;
    }

    public Box(int length, int breadth, int heigth) {
        this.length = length;
        this.breadth = breadth;
        this.heigth = heigth;
    }

    public static void main(String[] args) {
        Box foo = new Box();

    }
}
