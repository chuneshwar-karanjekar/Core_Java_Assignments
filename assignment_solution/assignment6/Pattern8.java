package assignment6;

public class Pattern8 {
	public static void main(String[] args) {
		int i, k;
		for (i = 1, k = 1; i <= 10; i++) {

			for (int j = 1; j <= 10; j++) {
				if (j <= i)
					System.out.print(k++);
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
