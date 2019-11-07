package Conditionals;

public class Paramiters {
	public int condition(int a, int b, boolean c) {
		if (b%2==0 || a%2 == 0) {
			return 0;
		}
		else if (c) {
			return a + b;
		} else {
			return a * b;
		}
	}
}
