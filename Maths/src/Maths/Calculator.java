package Maths;

public class Calculator {
		public int add(int a, int b) {
		return a + b;
	}
		public int multiply(int a, int b) {
		return a * b;
	}
		public int subtract(int a, int b) {
		return a - b;
	}
		public void divide(double a, double b) {
			if (a<b) {
				System.out.println(a / b);
				}
			else {
				System.out.println("the division cannot be performed");
			}
	}
}
