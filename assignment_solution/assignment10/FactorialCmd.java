
package assignment10;
/*
 * Calculate Factorial of an Integer with Command Line Argument in Java
 * 
 */
public class FactorialCmd {
    public static void main(String[] args) {
        int fact =1;
        int n = Integer.parseInt(args[0]);
        for(int i=1; i<=n; i++){
           // int n = Integer.parseInt(args[i]);
            fact = fact * i;
            System.out.println(fact);
        }
    }
}
 