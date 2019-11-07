package coins;

import java.text.DecimalFormat;

public class App {
	
	private static final DecimalFormat FORMAT = new DecimalFormat("#.##");

	public static String format(double money) {
		return FORMAT.format(money);
	}
	public static void main(String[] args) {
		Method pay = new Method();
		System.out.println(format(pay.change(5.70, 3.55)));
		
	}
}
