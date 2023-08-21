
package assignment8;
public class Program1{
    String accountNumber;
    String customerName;
    int balance;
    static int rateOfInterest;

    public void setDetails(String acouNum, String cusName, int bal, int roi){
        accountNumber = acouNum;
       customerName = cusName;
       balance = bal;
       rateOfInterest = roi;
        
    }
    public void calculateSI(int time){
        int simpleInterest = (balance*rateOfInterest*time)/100;
        System.out.println("your simple interest is :"+simpleInterest);
    }

    public String getAccointNum(){
            return accountNumber;
    }
     public int getBalance(){
            return balance;
    }
     public String getCustomerName(){
            return customerName;
    }
    public void display(){
        System.out.println("account name : "+customerName+"\naccount number : "+accountNumber+"\nyour balance is :"+balance);
    }

    public static void main(String[] args) {
        Program1 s1 = new Program1();
        s1.setDetails("1739409", "chuneshwar karanjekar", 35900, 9);
        s1.calculateSI(3);
        s1.display();
    }
}