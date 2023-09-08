package assignment20;

public class SmallestNumber {
    public static void main(String[] args) {
        int num[] = { 33, 35, 43, 56, 76, 12, 37 };
        int min = num[0];
        for (int i = 0; i < num.length; i++) {
            if (min > num[i])
                min = num[i];
        }
        System.out.println(min);
    }
}
