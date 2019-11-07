package taxes;

public class TaxesMain {
	public static void main(String[] args) {
		TaxesPercentage percent = new TaxesPercentage();
		TaxesValue Value = new TaxesValue();
		System.out.println("Precentage Tax: " + percent.percentageTax(37000) + "%");
		System.out.println("Amount of Tax: £" + Value.costOfTax(37000));
	}
}
  