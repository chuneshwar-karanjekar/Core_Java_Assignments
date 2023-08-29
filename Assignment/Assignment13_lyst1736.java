package assignments;
import java.util.Scanner;

public class A13 {
    Scanner sc;
    public void driver(){
        f10();

    }
    public void f1(){
        sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int x=sc.nextInt();
        if(x%2==0)
            System.out.println("Even");
        else
            System.out.println("Odd");
    }
    public void f2(){
        sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        System.out.println("Greatest number is "+(x>y?x>z?x:z:y>z?y:z));
    }
    public void f3(){
        sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int x=sc.nextInt();
        int count=0;
        while(x!=0){
            x/=10;
            count++;
        }
        System.out.println("Total Digits: "+count);

    }
    public void f4(){
        sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int x=sc.nextInt();
        int y=0,r;
        while(x!=0){
            r=x%10;
            y=10*y+r;
            x/=10;
        }
        System.out.println("Reversed number: "+y);

    }
    public void f5(){
        sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int s=0;
        for(int i=1;i<=n;i++)
            s=s+i;
        System.out.println("Sum is: "+s);

    }
    public void f6(){
        sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int s=0;
        for(int i=1;i<=n;i++)
            s=s+2*i-1;
        System.out.println("Sum is: "+s);

    }
    public void f7(){
        sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int s=0;
        for(int i=1;i<=n;i++)
            s=s+2*i;
        System.out.println("Sum is: "+s);

    }
    public void f8(){
        sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int s=0;
        for(int i=1;i<=n;i++)
            s=s+i*i;
        System.out.println("Sum is: "+s);

    }
    public void f9(){
        sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int x=sc.nextInt();
        int sum=0;
        while(x!=0){
            sum=sum+x%10;
            x/=10;

        }
        System.out.println("Sum of Digits: "+sum);

    }
    public void f10(){
        sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int p=1;
        for(int i=1;i<=n;i++)
            p=p*i;
        if(n>=0)
            System.out.println("Factorial is: "+p);

    }
}
