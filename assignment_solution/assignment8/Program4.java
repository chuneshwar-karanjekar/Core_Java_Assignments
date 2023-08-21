package assignment8;

public class Program4 {
    public static void main(String[] args) {
        //Batch batch = new Batch();
        Batch.setStartDate("17-07-2023");
        Batch.setBatchCode("java2023");
        Batch.setCourse("java full stack");
        Batch.setDays(80);
        Batch.setStudentCount(21);
        Batch.setTime(6);
        Batch.setTotalBatchs(12);

        System.out.println(Batch.getBatchCode());
        System.out.println(Batch.getCourse());
        System.out.println(Batch.getDays());
        System.out.println(Batch.getStartDate());
        System.out.println(Batch.getStudentCount());
        System.out.println( Batch.getTime());
        System.out.println(Batch.getTotalBatchs());

        
    }
}

class Batch{
    static int studentCount, time, days, totalBatchs;
    static String batchCode, course,startDate;

    public static String getStartDate() {
        return startDate;
    }

    public static void setStartDate(String startDate) {
        Batch.startDate = startDate;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public static void setStudentCount(int studentCount) {
        Batch.studentCount = studentCount;
    }

    public static int getTime() {
        return time;
    }

    public static void setTime(int time) {
        Batch.time = time;
    }

    public static int getDays() {
        return days;
    }

    public static void setDays(int days) {
        Batch.days = days;
    }

    public static int getTotalBatchs() {
        return totalBatchs;
    }

    public static void setTotalBatchs(int totalBatchs) {
        Batch.totalBatchs = totalBatchs;
    }

    public static String getBatchCode() {
        return batchCode;
    }

    public static void setBatchCode(String batchCode) {
        Batch.batchCode = batchCode;
    }

    public static String getCourse() {
        return course;
    }

    public static void setCourse(String course) {
        Batch.course = course;
    }

    
}
