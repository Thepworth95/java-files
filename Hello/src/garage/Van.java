package garage;

public class Van extends Paint {

	public Van() {
		super();
	}

	public Van(int numberOfSeats, int numberOfDoors, int numberOfWheels, double engineSize, String colour,
			boolean automatic) {
		super();
		this.setNumberOfSeats(numberOfSeats);
		this.setNumberOfDoors(numberOfDoors);
		this.setNumberOfWheels(numberOfWheels);
		this.setEngineSize(engineSize);
		this.setColour(colour);
		this.setAutomatic(automatic);
	}

	public void beepHorn() {
		System.out.println("Beeeeeep");
	}

	public void useWipers() {
		System.out.println("wipers move");
	}

	public void useBreaks() {
		System.out.println("Car stops");
	}

	@Override
	public void accelerate() {
		System.out.println("engine reves");
	}

	@Override
	public float calcBill() {
		return (float) ((getNumberOfWheels()*60)+(getEngineSize()*150));
	}

}
