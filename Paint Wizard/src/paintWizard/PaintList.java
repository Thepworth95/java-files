package paintWizard;

import java.util.ArrayList;
import java.util.List;

public class PaintList {

	private List<Paint> paints = new ArrayList<>();

	public boolean addPaint(Paint paint) {
		return this.paints.add(paint);
	}

	public boolean removePaint(Paint paint) {
		return this.paints.remove(paint);
	}

	public void printPaints() {
		for (Paint p : paints) {
			System.out.println(p);
		}
	}

	public void leastWaste() {
		Paint p0 = new Paint("", 1000000000, 1, 1);
		for (Paint p : paints) {
			if (p.getAmountPerArea() < p0.getAmountPerArea()) {
				p0.setAmountPerArea(p.getAmountPerArea());
				p0.setName(p.getName());
			}
		}
		System.out.println("The Paint witht the least waste is " + p0.getName());
	}

	public void costEffective() {

		Paint p0 = new Paint("", 1, 1, 100000000);
		for (Paint p : paints) {
			if (p.getPricePerArea() < p0.getPricePerArea()) {
				p0.setPricePerArea(p.getPricePerArea());
				p0.setName(p.getName());
			}
		}
		System.out.println("The cheapest paint is " + p0.getName());
	}

}
