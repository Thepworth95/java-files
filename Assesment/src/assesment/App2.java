package assesment;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class App2 {

	static DecimalFormat FORMAT = new DecimalFormat("#.###");

	public static String format(double distance) {
		return FORMAT.format(distance);
	}

	public static void main(String[] args) {

		Random randy = new Random();

		YouMove youMove = new YouMove();
		BeastMove beastMove = new BeastMove();

		Scanner scan = new Scanner(System.in);
		System.out.println("Are you ready to play, \"yes\" or \"no\"");
		String play = scan.nextLine();

		while (play.equals("yes")) {

			int xYou = 0;
			int yYou = 0;
			int xBeast = randy.nextInt(10) - randy.nextInt(10);
			int yBeast = randy.nextInt(10) - randy.nextInt(10);
			int xMasterSword = randy.nextInt(10) - randy.nextInt(10);
			int yMasterSword = randy.nextInt(10) - randy.nextInt(10);

			Beast2 beast = new Beast2(xBeast, yBeast);
			You you = new You(xYou, yYou);
			MasterSword masterSword = new MasterSword(xMasterSword, yMasterSword);

			System.out.println("Grey foggy clouds float oppressively close to you, \r\n"
					+ "reflected in the murky grey water which reaches up your shins.\r\n"
					+ "Some black plants barely poke out of the shallow water.\r\n"
					+ "However you do not let this take your concentration away from your goal.\r\n"
					+ "you look at your small watch-like device in your left hand,  \r\n"
					+ "it tells you how far you are from the legendary master sword.\r\n"
					+ "It only shows the distance from the master sword. \r\n"
					+ "In your right hand is  a monster detector, \r\n"
					+ "it tells you your distance from the Beast which protects the sword. \r\n"
					+ "reach the sword before the Beast finds you. \r\n"
					+ "Try \"north\", \"south\", \"east\", or \"west\"\r\n"
					+ "\"north east\", \"south east\", \"north west\", or \"south west\"\r\n" + "");
			while (Math.hypot((you.getXcoord() - masterSword.getXcoord()),(you.getYcoord() - masterSword.getYcoord())) != 0) {
				System.out.println("The compass reads " + format(Math.hypot((you.getXcoord() - masterSword.getXcoord()), (you.getYcoord() - masterSword.getYcoord()))) + "m, the beast locator reads " + format(Math.hypot((you.getXcoord() - beast.getXcoord()), (you.getYcoord() - beast.getYcoord()))) + "m");
				String input = scan.nextLine();
				int xtemp = you.getXcoord();
				int ytemp = you.getYcoord();
				if (input.equals("north")) {
					you.setXcoord(youMove.xcoordPlus(you.getXcoord()));
				} else if (input.equals("south")) {
					you.setXcoord(youMove.xcoordMinus(you.getXcoord()));
				} else if (input.equals("east")) {
					you.setYcoord(youMove.ycoordPlus(you.getYcoord()));
				} else if (input.equals("west")) {
					you.setYcoord(youMove.ycoordMinus(you.getYcoord()));
				} else if (input.equals("north west")) {
					you.setXcoord(youMove.xcoordPlus(you.getXcoord()));
					you.setYcoord(youMove.ycoordMinus(you.getYcoord()));
				} else if (input.equals("north east")) {
					you.setXcoord(youMove.xcoordPlus(you.getXcoord()));
					you.setYcoord(youMove.ycoordPlus(you.getYcoord()));
				} else if (input.equals("south west")) {
					you.setXcoord(youMove.xcoordMinus(you.getXcoord()));
					you.setYcoord(youMove.ycoordMinus(you.getYcoord()));
				} else if (input.equals("south east")) {
					you.setXcoord(youMove.xcoordMinus(you.getXcoord()));
					you.setYcoord(youMove.ycoordPlus(you.getYcoord()));
				} else {
					System.out.println(
							"Input not recognised. Please Try \"north\", \"south\", \"east\", or \"west\"\r\n\""
									+ "\"north east\", \"south east\", \"north west\", or \"south west\"");
				}
				if (xtemp != you.getXcoord() || ytemp != you.getYcoord()) {
					String s = Beast2.beastMovement();
					if (s.equals("north")) {
						beast.setXcoord(beastMove.xcoordPlus(beast.getXcoord()));
					} else if (s.equals("south")) {
						beast.setXcoord(beastMove.xcoordMinus(beast.getXcoord()));
					} else if (s.equals("east")) {
						beast.setYcoord(beastMove.ycoordPlus(beast.getYcoord()));
					} else if (s.equals("west")) {
						beast.setYcoord(beastMove.ycoordMinus(beast.getYcoord()));
					}
				}
				if (you.getXcoord() == beast.getXcoord() && you.getYcoord() == beast.getYcoord()) {
					you.setXcoord(masterSword.getXcoord());
					you.setYcoord(masterSword.getYcoord());
					beast.setXcoord(masterSword.getXcoord());
					beast.setYcoord(masterSword.getYcoord());
				}
			}
			if (you.getXcoord() == beast.getXcoord() && you.getYcoord() == beast.getYcoord()) {
				System.out.println("Game Over, you were caught by The Beast and failed to get the master sword. \r\n"
						+ "without it you will never have the power to vanquish the lord of darkness gannon.\r\n"
						+ "Would you like to play again, \"yes\" or \"no\"");
				String play1 = scan.nextLine();
				play = play1;
			} else {
				System.out.println("Congratulations you found the all powerfull Master sword. \r\n"
						+ "with it you now have the power to vanquish the lord of darkness gannon, Congratulations.\r\n"
						+ "Would you like to play again, \"yes\" or \"no\"");
				String play1 = scan.nextLine();
				play = play1;
			}
		}
		scan.close();
		System.out.println("Thanks for playing");
	}

}