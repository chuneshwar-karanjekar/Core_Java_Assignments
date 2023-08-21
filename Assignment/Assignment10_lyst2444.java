package assignments;

public class A10 {
    /*
    public A10(String []args){ //Question-1

        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int c=a+b;
        System.out.println("Sum is "+c);
    }
    */
    /*
    public A10(String []args){ //Question-2
        int sum=0;
        for(int i=0;i<args.length;i++)
            sum=sum+Integer.parseInt(args[i]);

        System.out.println("Sum is "+sum);
    }
    */
    /*
    public A10(String []args){ //Question-3

        for(int i=0;i<args.length;i++)
            System.out.println(args[i]);
    }
    */
    /*
    public A10(String []args){ //Question-4

        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int L;
        for(L=a>b?a:b;L<=a*b;L++)
            if(L%a==0&&L%b==0)
                break;
        System.out.println("LCM is "+L);
    }
    */
    /*
    public A10(String []args){ //Question-5

        int a=Integer.parseInt(args[0]);
        int i;
        for(i=2;i<a;i++)
            if(a%i==0)
                break;
        if(i==a)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");
    }
    */

    /*
    public A10(String []args){ //Question-6
        int a,i;
        for(int j=0;j<args.length;j++){
            a=Integer.parseInt(args[j]);
            for(i=2;i<a;i++)
                if(a%i==0)
                    break;
            if(i==a)
                System.out.println(a);
        }
    }

     */
    /*
    public A10(String []args){ //Question-7

        int a=Integer.parseInt(args[0]);
        int f=1;
        while(a!=0){
            f=f*a;
            a--;
        }
        System.out.println("Factorial is "+f);
    }

     */
    /*
    public A10(String []args){ //Question-8
        int a,b,s;
        for(int j=0;j<args.length;j++){
            a=Integer.parseInt(args[j]);
            b=a;
            s=0;
            while(b!=0){
                s=s+b%10;
                b=b/10;
            }
            System.out.println(a+" - "+s);
        }
    }

     */
    /*
    public A10(String []args){ //Question-9
        int max,a;
        max=Integer.parseInt(args[0]);
        for(int j=1;j<args.length;j++) {
            a = Integer.parseInt(args[j]);
            if (max < a)
                max = a;
        }
        System.out.println("Greatest number is "+max);

    }

     */
    public A10(String []args){ //Question-10

        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);
        int H;
        for(H=a<b?a:b;H>=1;H--)
            if(a%H==0&&b%H==0)
                break;
        System.out.println("HCF is "+H);
    }
    public void driver(){
    }
}
