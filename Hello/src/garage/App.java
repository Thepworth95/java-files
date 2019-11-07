package garage;

public class App {

	public static void main(String[] args) {
		
		Garage g = new Garage();
		g.addVehicle(new Car(5, 5, 4, 1.6, "Navy", false));
		g.addVehicle(new Bike(3, 1.2, "Green", true));
		g.addVehicle(new Van(5, 4, 4, 1.8, "White", false));
		g.printVehicles();
		g.costOfGarage();
		g.removeVehiclesByType(Car.class);
		g.printVehicles();
		g.costOfGarage();
		g.clearGarage();
		g.printVehicles();
		g.costOfGarage();
	}

}
