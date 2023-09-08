package assignment_6;

public class Pattern9 {
    public static void main(String[] args) {
        int i ,j;
        char k;
        for( i=1,k=1; i<=10; i++){
            k=(char)(64+i);
            for( j=1; j<=10; j++){
                if(j>=i)
                System.out.print(k++);
            else
            System.out.print(" ");
            }
            System.out.println();
        }
    }
}
