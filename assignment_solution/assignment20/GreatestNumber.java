package assignment20;

public class GreatestNumber {
    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 6, 89, 11, 22, 44 };
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
            // for (int j = i + 1; j < arr.length - 1; j++) {
            // if (arr[i] > arr[j]) {
            // System.out.print("Greatest number :" + arr[i]);
            // j--;
            // i++;
            // }
            // }
        }
        System.out.println("Max is :" + max);

    }
}
