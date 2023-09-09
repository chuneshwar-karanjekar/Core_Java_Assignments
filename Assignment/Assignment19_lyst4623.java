package assignments;

public class A19 {
    public void driver() {
        SavingAccount myAccount=new SavingAccount();
        myAccount.setCustomerName("Saurabh Shukla");
        myAccount.setBalance(5000);
        myAccount.setAccountNo(12345);
        SavingAccount.setRateOfInterest(6.5);
        System.out.println("Account Number: "+myAccount.getAccountNo());
        System.out.println("Customer Name: "+myAccount.getCustomerName());
        System.out.println("Account Balance: "+myAccount.getBalance());
        System.out.println("Rate of Interest: "+SavingAccount.getRateOfInterest());
        System.out.println("Simple Interest received: "+myAccount.calculateInterest(3));
    }
}
abstract class Account1{
    private double balance;
    private int accountNo;
    private static double rateOfInterest;

    public double getBalance() {
        return balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public static double getRateOfInterest() {
        return rateOfInterest;
    }

    public static void setRateOfInterest(double rateOfInterest) {
        Account1.rateOfInterest = rateOfInterest;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    public abstract double calculateInterest(int time);
     
}
class SavingAccount extends Account1{
    private String customerName;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public double calculateInterest(int time){
        double si;
        si=getBalance()*Account1.getRateOfInterest()*time/100;
        return si;
    }
}
