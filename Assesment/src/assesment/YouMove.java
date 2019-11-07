package assesment;

public class YouMove {

	public int xcoordPlus(int a) {
		if (a <= 10) {
		return ++a;
		} else {
			System.out.println("World limit reached, move a diffrent direction");
			return a;
		}
	}

	public int xcoordMinus(int b) {
		if (b >= -10) {
		return --b;
		} else {
			System.out.println("World limit reached, move a diffrent direction");
			return b;
		}
	}
	
	public int ycoordPlus(int c) {
		if (c <= 10) {
		return ++c;
		} else {
			System.out.println("World limit reached, move a diffrent direction");
			return c;
		}
	}
	
	public int ycoordMinus(int d) {
		if (d >= -10) {
		return --d;
		} else {
			System.out.println("World limit reached, move a diffrent direction");
			return d;
		}

	}

}
