package assignments;

public class Assignment7 {
    public void driver(){
        Distance d1=new Distance();
        Distance d2=new Distance();
        Distance d3;
        d1.setDistance(3,40,10);
        d2.setDistance(2,150,20);
        d3=d1.addDistance(d2);
        d3.displayDistance();
    }
}
class Book{
    private int bookId;
    private String title;
    private double price;
    private String author;
    public void setBookId(int id){
        bookId=id;
    }
    public void setTitle(String t){
        title=t;
    }
    public void setPrice(double p){
        price=p;
    }
    public void setAuthor(String a){
        author =a;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }
}
class Circle{
    private float radius;

    public void setRadius(float radius) {
        this.radius = radius;
    }
    public float getArea(){
        return 3.14f*radius*radius;
    }
    public float getCircumference(){
        return 2*3.14f*radius;
    }
}
class Distance{
    private int km,m,cm;
    public void setDistance(int x,int y,int z){
        km=x;
        m=y;
        cm=z;
    }
    public void displayDistance(){
        System.out.println(km+"km "+m+"m "+cm+"cm");
    }
    public Distance addDistance(Distance d){
        Distance temp=new Distance();
        temp.cm=cm+d.cm;
        temp.m=temp.cm/100 + m+d.m;
        temp.cm=temp.cm%100;
        temp.km=temp.m/1000+km+d.km;
        temp.m=temp.m%1000;
        return temp;
    }
}
class Course{
    private int courseId;
    private String courseName;
    private String duration;
    private double fee;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }
}
class Question{
    private int queNo;
    private String que;
    private String optionA,optionB,optionC,optionD;
    private char answer;
    public void setQuestion(int qno,String q,String a,String  b,String c, String d,char ans) {
        queNo=qno;
        que=q;
        optionA=a;
        optionB=b;
        optionC=c;
        optionD=d;
        answer=ans;
    }
    public void displayQuestion(){
        System.out.println(queNo+". "+que);
        System.out.println("(a) "+ optionA);
        System.out.println("(b) "+ optionB);
        System.out.println("(c) "+ optionC);
        System.out.println("(d) "+ optionD);
        System.out.println("Answer: "+answer);
    }
}

class Contact{
    private int id;
    private String firstName,lastName,mobile,emailid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
}
class Employee{
    private int empid;
    private String name;
    private float salary;

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
class Cuboid{
    private int length,breadth,height;
    public void setLength(int l){ length=l; }
    public void setBreadth(int b){breadth=b;}
    public void setHeight(int h){height=h;}
    public int getLength(){return length;}
    public int getBreadth(){return breadth;}
    public int getHeight(){return height;}
    public int getVolume(){ return length*breadth*height;}
    public int getSurfaceArea(){return 2*(length*breadth+breadth*height+length*height);}
}
class Time{
    private int hr,min,sec;
    public void setTime(int h,int m,int s){
        hr=h;
        min=m;
        sec=s;
    }
    public void showTime(){
        System.out.println(hr+":"+min+":"+sec);
    }
}
class Complex{
    private int real,imag;
    public void setComplex(int r,int i){
        real=r;
        imag=i;
    }
    public void printComplex(){
        System.out.println("Real="+real+" imag="+imag);
    }
}
