package assignment3;

public class ReverseThreeNumber {
public static void main(String[] args) {
	int x =247;
	int revers=0;
	while(x!=0) {
		int y = x%10;
		revers = revers*10 + y;
		x=x/10;
		
	}
	System.out.println("reverse is "+revers);
}
}
