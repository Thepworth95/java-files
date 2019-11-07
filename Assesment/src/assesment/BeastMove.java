package assesment;

public class BeastMove {

	public int xcoordPlus(int a) {
		if (a <= 10) {
		return ++a;
		} else {
			return --a;
		}
	}

	public int xcoordMinus(int b) {
		if (b >= -10) {
		return --b;
		} else {
			return ++b;
		}
	}
	
	public int ycoordPlus(int c) {
		if (c <= 10) {
		return ++c;
		} else {
			return --c;
		}
	}
	
	public int ycoordMinus(int d) {
		if (d >= -10) {
		return --d;
		} else {
			return ++d;
		}

	}

}
