package assignments;
import java.util.Scanner;
public class A20 {
    Scanner sc;
    {
        sc=new Scanner(System.in);
    }
    public void driver(){
        f5();
    }
    void f1() {
        int n;
        System.out.println("How many numbers you want to enter: ");
        n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter value number "+(i+1));
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++)
            System.out.println("arr["+i+"]="+arr[i]);
    }
    void f2()
    {
        int n;
        System.out.println("How many numbers you want to enter: ");
        n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter value number "+(i+1));
            arr[i]=sc.nextInt();
        }
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(max<arr[i])
                max=arr[i];
        }
        System.out.println("Max value is "+max);
    }
    void f3()
    {
        int n;
        System.out.println("How many numbers you want to enter: ");
        n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter value number "+(i+1));
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(min>arr[i])
                min=arr[i];
        }
        System.out.println("Max value is "+min);

    }
    void f4()
    {
        int n;
        System.out.println("How many numbers you want to enter: ");
        n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter value number "+(i+1));
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum is "+sum);
    }
    void f5()
    {
        int n;
        System.out.println("How many numbers you want to enter: ");
        n=sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter value number "+(i+1));
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        double avg=sum/n;
        System.out.println("Average is "+avg);
    }
}
