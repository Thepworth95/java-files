package rps;

public class PlayerRock {
	
	public String result() {
		ComputerAction act = new ComputerAction();
		String s = act.computerAction();
		if (s.equals("rock")) {
			return "draw";
		}else if (s.equals("paper")) {
			return "lose";
		}else {
			return "win";
		}
		
	}

}
