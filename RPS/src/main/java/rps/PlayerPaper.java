package rps;

public class PlayerPaper {
	
	public String result() {
		ComputerAction act = new ComputerAction();
		String s = act.computerAction();
		if (s.equals("rock")) {
			return "win";
		}else if (s.equals("paper")) {
			return "draw";
		}else {
			return "lose";
		}
		
	}

}
