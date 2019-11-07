package garage;

public abstract class Paint {
	
	private int numberOfSeats;
	private int numberOfDoors;	
	private int numberOfWheels;
	private double engineSize;
	private String colour;
	private boolean automatic;

	
	public Paint() {
		super();
	}
	
	public abstract float calcBill();
	
		@Override
	public String toString() {
		return "Vehicle [numberOfSeats=" + numberOfSeats + ", numberOfDoors=" + numberOfDoors + ", numberOfWheels="
				+ numberOfWheels + ", engineSize=" + engineSize + ", colour=" + colour + ", automatic=" + automatic
				+ "]";
	}

		public abstract void accelerate();

		public Paint(int numberOfSeats, int numberOfDoors, int numberOfWheels, double engineSize, String colour,
			boolean automatic) {
		super();
		this.numberOfSeats = numberOfSeats;
		this.numberOfDoors = numberOfDoors;
		this.numberOfWheels = numberOfWheels;
		this.engineSize = engineSize;
		this.colour = colour;
		this.automatic = automatic;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public double getEngineSize() {
		return engineSize;
	}

	public void setEngineSize(double engineSize2) {
		this.engineSize = engineSize2;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public boolean isAutomatic() {
		return automatic;
	}

	public void setAutomatic(boolean automatic) {
		this.automatic = automatic;
	}

}
