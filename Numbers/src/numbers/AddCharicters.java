package numbers;

public class AddCharicters {
	
	public int add(int a) {
		int b = 0;
		b += a%10;
		b += (a-a%10)/10;
		return b;
	}
}
