package assignments;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Assignment8 {
    public void Driver(){
        SuperCar sc = SuperCar.getInstance();
    }
}
class Box{
    private int length, breadth, height;
    private static int boxCount;
    public void setDimension(int l,int b,int h){
        length=l;
        breadth=b;
        height=h;
    }
    public void showDimension(){
        System.out.println("Length="+length);
        System.out.println("Breadth="+breadth);
        System.out.println("Height="+height);

    }
    public static void showBoxCount(){
        System.out.println("Box Count="+boxCount);
    }

}
class Batch{
    private int batchCode;
    private String courseName;
    private LocalDateTime startDate;
    private int studentCount;
    private LocalDateTime time;
    private String days;
    private static int totalBatches;

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public int getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(int batchCode) {
        this.batchCode = batchCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public String getDays() {
        return days;
    }

    public void setDays(String days) {
        this.days = days;
    }

    public static int getTotalBatches() {
        return totalBatches;
    }

    public static void setTotalBatches(int totalBatches) {
        Batch.totalBatches = totalBatches;
    }
}
class Video{
    private int videoId;
    private String title;
    private int likes;
    private static int totalVideos;

    public int getVideoId() {
        return videoId;
    }

    public void setVideoId(int videoId) {
        this.videoId = videoId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public static int getTotalVideos() {
        return totalVideos;
    }

    public static void setTotalVideos(int totalVideos) {
        this.totalVideos = totalVideos;
    }
}
class SuperCar{
    private String ownerName;
    private double price;
    private String colour;
    private String brand;
    private SuperCar(){

    }
    private static SuperCar ref;
    public static SuperCar getInstance(){
        if(ref==null) {
            ref=new SuperCar();
            return ref;
        }
        return null;
    }
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
class Account{
    private int accountNumber;
    private String customerName;
    private double balance;
    private static float rateOfInterest;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setRateOfInterest(float rateOfInterest) {
        Account.rateOfInterest = rateOfInterest;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public static float getRateOfInterest() {
        return rateOfInterest;
    }
    public double getSimpleInterest(int time){
        return balance*rateOfInterest*time/100.0;
    }
}