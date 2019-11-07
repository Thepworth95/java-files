package rps;

import java.util.Random;

public class ComputerAction {

	public String computerAction() {
		
			Random randomAction = new Random();
			int z = randomAction.nextInt(3);
			if (z == 0) {
				System.out.println("computer - rock");
				return "rock";
			} else if (z == 1) {
				System.out.println("computer - paper");
				return "paper";
			} else {
				System.out.println("computer - scissors");
				return "scissors";
			}
	}

}
