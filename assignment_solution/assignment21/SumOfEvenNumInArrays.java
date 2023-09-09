package assignment21;

public class SumOfEvenNumInArrays {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 5, 6, 7, 8 };
        int even = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {
                even = even + arr[i];
            }
        }
        System.out.println("Sum of even number :" + even);
    }
}
