package assignment_6;

public class Pattern5 {
    public static void main(String[] args) {
        int k;
        for(int i=1; i<=5; i++){
            k=1;
            for(int j=1; j<=5; j++){
                if(j<=i)
                System.out.print(k++);
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
