package uniqueSum;

public class UniqueSumCode {
	public int input(int a, int b, int c) {
		if (a == b && a != c) {
			return a + c;
		} else if (a == c && a != b) {
			return a + b;
		} else if (a == b && a == c) {
			return a;
		}else if (b == c && a != b) {
			return c + a;
		} else {
			return a + b + c;
		}
	}
}
