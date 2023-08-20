package assignment_6;

public class pattern7 {
    public static void main(String[] args) {
        char k;
        for(int i=1; i<=10; i++){
            k='A';
            for(int j=1; j<=10; j++){
                if(j>=i)
                System.out.print(k++);
            else
            System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}
