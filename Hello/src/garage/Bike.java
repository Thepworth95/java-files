package garage;

public class Bike extends Paint {
	
	
	public Bike() {
		super();
		setNumberOfDoors(0);
		setNumberOfWheels(2);
	}
		
	public Bike(int numberOfSeats, double engineSize, String colour, boolean automatic) {
		super();
		this.setNumberOfSeats(numberOfSeats);
		this.setEngineSize(engineSize);
		this.setColour(colour);
		this.setAutomatic(automatic);
		setNumberOfDoors(0);
		setNumberOfWheels(2);
	}

	public void useFrontBreaks() {
		System.out.println("front Wheel slows");
	}
	
	public void useBackBreaks() {
		System.out.println("Back wheel slows");
	}

	@Override
	public void accelerate() {
		System.out.println("engine reves");
	}

	@Override
	public float calcBill() {
		return (float) (120+(getEngineSize()*150));
	}

}
