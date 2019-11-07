package coins;

public class Method {
	public double change(double payed, double cost) {
		App.format(cost);
		return payed-cost;
	}
}
