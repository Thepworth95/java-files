package assesment;

import java.util.Random;

public class Beast {

	public String beast() {
		Random randomDirection = new Random();
		int z = randomDirection.nextInt(4);
		if (z == 0) {
			return "north";
		} else if (z == 1) {
			return "south";
		} else if (z == 2) {
			return "east";
		} else {
			return "west";
		}
		
		
	}
	
}
