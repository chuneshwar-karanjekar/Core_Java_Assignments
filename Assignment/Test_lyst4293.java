package world;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Test {

    public static  void testDriver() throws InsufficientBalance{
        Scanner sc = new Scanner(System.in);
        SavingAccount myAccount=new SavingAccount(100,5000);
        myAccount.showBalance();
        System.out.println("Enter amount to withdraw");
        //try {
            myAccount.withdraw(sc.nextDouble());
        /*}
        catch(InsufficientBalance e){
            System.out.println(e.getMessage());
        }*/

        myAccount.showBalance();

        /*try {
            System.out.println("Enter two numbers");
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(b==0)
                throw new ArithmeticException("Cannot divide a number by zero");
            int c = a / b;
            System.out.println("Result is " + c);
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException e){
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Enter a number");
            sc.next();
            int d = sc.nextInt();
            int e = d * d;
            System.out.println("Square is " + e);
        }
        catch(Exception e){
            System.out.println("Some exception");
        }
*/
    }
}
class SavingAccount{
    private int accountNumber;
    private double balance;
    public SavingAccount(int ano,double balance){
        accountNumber=ano;
        this.balance=balance;
    }
    public void addMoney(double amt){
        balance=balance+amt;
    }
    public void withdraw(double amt) throws InsufficientBalance{
        if(balance<amt)
            throw new InsufficientBalance("Insufficient Balance");
        balance=balance-amt;
    }
    public void showBalance(){
        System.out.println("Current Balance is "+balance);
    }
}
class InsufficientBalance extends Exception{
    public InsufficientBalance(String s){
        super(s);
    }
}


