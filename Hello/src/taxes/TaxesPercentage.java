package taxes;

public class TaxesPercentage {
	public int percentageTax(int a) {
		if (a < 15000) {
			return 0;
		} else if (a<20000) {
			return 10;
		} else if (a<30000) {
			return 15;
		} else if (a<45000) {
			return 20;
		} else {
			return 25;
		}
	}
}
