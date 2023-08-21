package assignment2;

public class SwapIntWithoutUsingThirdVariable {
public static void main(String[] args) {
	int x = 200;
	int y = 900;
	x =x+y;
	y=x-y;
	x=x-y;
	System.out.println("x="+x+" "+"y="+y);
}
}
