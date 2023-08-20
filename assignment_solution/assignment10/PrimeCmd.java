package assignment10;
public class PrimeCmd {
    public static void main(String [] args) {
        for(int i=0; i<args.length; i++){
            int n = Integer.parseInt(args[i]);
            if(n%2==1)
            System.out.println(args[n]+" is prime .");
            
        }
    }
}
