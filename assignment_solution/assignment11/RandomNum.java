package assignment11;

import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        int min =100;
        int max =200;
        int b = (int)(Math.random()*(max-min+1)+min);
        System.out.println(b);
    }
}
