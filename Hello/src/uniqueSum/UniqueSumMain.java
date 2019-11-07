package uniqueSum;

public class UniqueSumMain {
	public static void main(String[] args) {
		UniqueSumCode calc = new UniqueSumCode();
		System.out.println(calc.input(1, 2, 3));
		System.out.println(calc.input(3, 3, 3));
		System.out.println(calc.input(3, 2, 3));
		System.out.println(calc.input(1, 2, 2));
		System.out.println(calc.input(2, 2, 3));
	}
}