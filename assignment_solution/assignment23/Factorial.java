package assignment23;

public class Factorial {
    public static void main(String[] args) {

        int num = 10;
        int a = 0, b = 1, next = 0;
        for (int i = 0; i < num; i++) {
            next = a + b;
            a = b;
            b = next;
            System.out.println(next);
        }
    }
}
