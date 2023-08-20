package assignment10;
/**
 * write a java program to add two number, number are provided througth command line
 */
public class AddNum {
public static void main(String[] args) {
    System.out.println("cmd program");
    int sum =0;
    for (int i = 0; i < args.length; i++) {
        int result = Integer.parseInt(args[i]);
        sum += result;
        System.out.println(sum);
    }
}
    
}