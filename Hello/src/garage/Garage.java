package garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	private List<Paint> vehicles = new ArrayList<>();

	public Garage() {
		super();
	}

	public boolean addVehicle(Paint vehicle) {
		return this.vehicles.add(vehicle);
	}

	public boolean removeVehicle(Paint vehicle) {
		return this.vehicles.remove(vehicle);
	}

	public void removeVehiclesByType(Class<?> clazz) {
		List<Paint> toRemove = new ArrayList<>();
		for (Paint v : vehicles) {
			if (v.getClass() == clazz) {
				toRemove.add(v);
			}
		}
		vehicles.removeAll(toRemove);
	}

	public void printVehicles() {
		System.out.println("Vehicles currently in garage: ");
		for (Paint v : vehicles) {
			System.out.println(v);
		}
	}

	public void costOfGarage() {
		float costOfRepairs = 0;
		for (Paint v : vehicles) {
			costOfRepairs += v.calcBill();
		}
		System.out.println("Cost of repairs: £" + costOfRepairs);
	}
	
	public void clearGarage() {
		this.vehicles.clear();
	}
}
