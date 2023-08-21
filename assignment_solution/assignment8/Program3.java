package assignment8;

import java.sql.Time;

public class Program3 {
   static int videoID, views, like, totalVideo;
   static String tittle;

    static void setProperties(int videoID, int views, int like, int totalVideo, String tittle){
        Program3.videoID = videoID;
        Program3.views = views;
        Program3.like = like;
        Program3.totalVideo = totalVideo;
        Program3.tittle = tittle;
    }

    static void getProperties(){
        System.out.println("My video Title is :"+tittle+"\nvideo id is :"+videoID+"\n like :"+like+"\nviews :"+views+"\ntotal videos :"+totalVideo);
    }
    
    public static void main(String[] args) {
        Program3 s3 = new Program3();
        s3.setProperties(2304948, 1000, 390, 15, "How to make tutorials.");
   s3.getProperties();
    }
}
