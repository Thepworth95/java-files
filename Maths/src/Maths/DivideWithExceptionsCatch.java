package Maths;

public class DivideWithExceptionsCatch {
	public void divide(double a, double b) throws AIsBiggerThanBCatch {
		try {
			System.out.println(a / b);
		} catch (AIsBiggerThanBCatch aaaaaa) {
			if (a>b) {
				System.out.println(aaaaaa.toString());
			}

		}
	}

}
