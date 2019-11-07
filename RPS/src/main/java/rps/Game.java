package rps;

import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		
		RPS game = new RPS();
		Scanner scan = new Scanner(System.in);
		String play = "yes";
		int plays = 0;
		int wins = 0;
		int draws = 0;
		int losses = 0;
		int numberOfRocks = 0;
		int numberOfPapers = 0;
		int numberOfScissors = 0;
		
		String a;
		
		while (play.equals("yes")) {
			System.out.println("enter choice");
			String playerAction = scan.nextLine();
			a = game.game(playerAction);
			if (playerAction.equals("rock")) {
				numberOfRocks++;
			} else if(playerAction.equals("paper")) {
				numberOfPapers++;
			} else if(playerAction.equals("scissors")) {
				numberOfScissors++;
			}
			System.out.println(a);
			plays++;
			if (a.equals("win")) {
				wins++;
			} else if (a.equals("draw")) {
				draws++;
			} else if (a.equals("lose")) {
				losses++;
			}
			System.out.println("Play again?");
			play = scan.nextLine();
			
		}
		scan.close();
		int mostNumber = 0;
		String mostChosen = null;
		double percentage = 0;
		
		if (numberOfRocks > numberOfPapers && numberOfRocks > numberOfScissors) {
			mostNumber = numberOfRocks;
			mostChosen = "Rock";
		} else if (numberOfPapers > numberOfRocks && numberOfPapers > numberOfScissors) {
			mostNumber = numberOfPapers;
			mostChosen = "Paper";
		} else if (numberOfScissors > numberOfPapers && numberOfScissors > numberOfRocks) {
			mostNumber = numberOfScissors;
			mostChosen = "Scissors";
		} else if (numberOfRocks == numberOfPapers && numberOfRocks == numberOfScissors) {
			mostNumber = numberOfRocks;
			mostChosen = "Rock, Paper and Scissors";
		} else if (numberOfRocks == numberOfPapers) {
			mostNumber = numberOfRocks;
			mostChosen = "Rock and Paper";
		} else if (numberOfRocks == numberOfScissors) {
			mostNumber = numberOfRocks;
			mostChosen = "Rock and Scissors";
		} else if (numberOfPapers == numberOfScissors) {
			mostNumber = numberOfPapers;
			mostChosen = "Paper and Scissors";
		} 
		percentage = 100*mostNumber/plays;
		System.out.println("Record \r\n"
				+ "Total Games - " + plays + "\r\n"
				+ "Player Wins - " + wins + "\r\n"
				+ "Computer Wins - " + losses + "\r\n"
				+ "Tied Games - " + draws + "\r\n"
				+ "Picked " + mostChosen + " the most times, it was picked " + mostNumber + " times which is " + percentage + "% of the time");
	}
}






























