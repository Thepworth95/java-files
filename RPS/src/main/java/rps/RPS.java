package rps;

public class RPS {
	
	public String game(String playerAction) {
		PlayerRock rock = new PlayerRock();
		PlayerPaper paper = new PlayerPaper();
		PlayerScissors scissors = new PlayerScissors();
		
		if (playerAction.equals("rock")) {
			System.out.println("Player - rock");
			return rock.result();
		} else if (playerAction.equals("paper")) {
			System.out.println("Player - paper");
			return paper.result();			
		} else {
			System.out.println("Player - scissors");
			return scissors.result();			
		}
		
		

	}

}
