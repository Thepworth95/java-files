package rps;

public class PlayerScissors {
	
	public String result() {
		ComputerAction act = new ComputerAction();
		String s = act.computerAction();
		if (s.equals("rock")) {
			return "lose";
		}else if (s.equals("paper")) {
			return "win";
		}else {
			return "draw";
		}
		
	}

}
