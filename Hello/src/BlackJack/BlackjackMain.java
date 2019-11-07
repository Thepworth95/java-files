package BlackJack;

public class BlackjackMain {
	public static void main(String[] args) {
		UniqueSumCode calc = new UniqueSumCode();
		System.out.println(calc.play(10, 21));
		System.out.println(calc.play(20, 18));
		System.out.println(calc.play(1, 22));
		System.out.println(calc.play(22, 23));
	}
}
