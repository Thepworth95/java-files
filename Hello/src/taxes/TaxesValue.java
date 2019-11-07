package taxes;

public class TaxesValue {
	TaxesPercentage percent = new TaxesPercentage();
	
	public double costOfTax(int a) {
		;
		return a*percent.percentageTax(a)/100;
	}
}


