package Maths;

public class DivideWithExceptionsThrow {
	public void divide(double a, double b) throws AIsBiggerThanBThrow {
		if (a > b) {
			throw new AIsBiggerThanBThrow();

		} else {
			System.out.println(a / b);
		}
	}

}
