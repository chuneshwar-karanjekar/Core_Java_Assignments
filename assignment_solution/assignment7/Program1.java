package assignment7;

public class Program1 {
	int num1;
	int num2;

	public void complexNumber(int n1, int n2) {
		num1 = n1;
		num2 = n2;
		System.out.println("number1 " + num1 + " " + "number2 " + num2);
	}

	public static void main(String[] args) {
		Program1 obj = new Program1();
		obj.complexNumber(100, 200);

	}
}