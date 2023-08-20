package assignment_3;

public class SumOfDigit {
	public static void main(String[] args) {
		int x =2347;
		int sum =0,y;
		while(x>0) {
			y = x%10; // find last digit 
			sum = sum +y; // add last digit
			x = x/10; // remove last digit
		}
		System.out.println("sum of digit is "+sum);
		
		
	}
}
