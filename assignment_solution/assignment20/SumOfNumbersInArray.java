package assignment20;

public class SumOfNumbersInArray {
    public static void main(String[] args) {
        int arr[] = { 2, 4, 32, 4, 44, 22, 323, 45 };
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("sum of array is :" + sum);

    }
}
