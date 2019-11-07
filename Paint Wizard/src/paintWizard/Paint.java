package paintWizard;

public class Paint {
	private String name;
	private int amount;
	private int coverage;
	private double cost;
	private double amountPerArea;
	private double pricePerArea;
	
	public Paint(String name, int amount, int coverage, double cost) {
		super();
		this.name = name;
		this.amount = amount;
		this.coverage = coverage;
		this.cost = cost;
		this.amountPerArea = (double) amount/coverage;
		this.pricePerArea = cost/coverage;
	}
	
@Override
	public String toString() {
		return "Paint- [Amount = " + amount + " liters, coverage = " + coverage + " square meters, Cost = £" + cost + ", amountPerArea = " + amountPerArea + " liters per square meter, pricePerArea = £" +  pricePerArea + " per square meter]";
	}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAmount() {
	return amount;
}

public void setAmount(int amount) {
	this.amount = amount;
}

public int getCoverage() {
	return coverage;
}

public void setCoverage(int coverage) {
	this.coverage = coverage;
}

public double getCost() {
	return cost;
}

public void setCost(double cost) {
	this.cost = cost;
}

public double getAmountPerArea() {
	return amountPerArea;
}

public void setAmountPerArea(double amountPerArea) {
	this.amountPerArea = amountPerArea;
}

public double getPricePerArea() {
	return pricePerArea;
}

public void setPricePerArea(double pricePerArea) {
	this.pricePerArea = pricePerArea;
}
	

	
}
