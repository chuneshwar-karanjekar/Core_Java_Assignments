package assignment7;

public class Program2 {
	int hours;
	int minutes;
	int seconds;

	public void setValue(int hr, int min, int sec) {
		hours = hr;
		minutes = min;
		seconds = sec;

	}

	void display() {
		System.out.println(hours + "hr " + minutes + "min " + seconds + "sec ");
	}

	public static void main(String[] args) {
		Program2 obj = new Program2();

		obj.setValue(3, 45, 20);
		obj.display();
	}

}
