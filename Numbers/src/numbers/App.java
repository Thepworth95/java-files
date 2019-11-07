package numbers;

public class App {
	public static void main(String[] args) {

		AddCharicters add = new AddCharicters();
		System.out.println(add.add(27));

		Print3DigitNumber print3D = new Print3DigitNumber();
		for (int i = 1; i <= 100; i++) {
			System.out.println(print3D.printNumber(i));

		}
	}
}
