package paintWizard;

public class App {
	
	public static void main(String[] args) {
		
		PaintList p = new PaintList();
		p.addPaint(new Paint("CheapoMax",21, 10, 19.19));
		p.addPaint(new Paint("ThatOneWithTheDog",40, 16, 34.38));
		p.addPaint(new Paint("AverageJoes",16, 11, 17.99));
		p.addPaint(new Paint("DuluxourousPaints",10, 22, 25));
		p.printPaints();
		p.leastWaste();
		p.costEffective();
		}
		
		
	}
	