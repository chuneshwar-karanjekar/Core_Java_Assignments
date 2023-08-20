package assignment_7;

import java.util.Scanner;

public class Program5 {
    private int id,mobileNo;
    private String firstName,lastName,emailId;
    
    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public int getMobileNo() {
        return mobileNo;
    }


    public void setMobileNo(int mobileNo) {
        this.mobileNo = mobileNo;
    }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getEmailId() {
        return emailId;
    }


    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }


    public void display(){
        System.out.println("id :"+id);
        System.out.println("firstName :"+firstName);
        System.out.println("lastName :"+lastName);
        System.out.println("mobileNo :"+mobileNo);
        System.out.println("Email ID :"+emailId);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your information id ,mobile,first,last,email:");
        int id = sc.nextInt();
        int mobileNo = sc.nextInt();
        String fname = sc.nextLine();
        String lname = sc.nextLine();
        String email = sc.nextLine();

        Program5 obj = new Program5();
        obj.setId(id);
        obj.setMobileNo(mobileNo);
        obj.setFirstName(fname);
        obj.setLastName(lname);
        obj.setEmailId(email);

        obj.display();
        
    }
}
