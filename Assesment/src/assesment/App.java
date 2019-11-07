package assesment;

import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class App {

	static DecimalFormat FORMAT = new DecimalFormat("#.###");

	public static String format(double distance) {
		return FORMAT.format(distance);
	}

	public static void main(String[] args) {

		int x;
		int y;
		int a;
		int b;

		Beast beastMove = new Beast();

		Random randy = new Random();

		Scanner scan = new Scanner(System.in);
		System.out.println("Are you ready to play, \"yes\" or \"no\"");
		String play = scan.nextLine();

		while (play.equals("yes")) {
			y = randy.nextInt(10) - randy.nextInt(10);
			x = randy.nextInt(10) - randy.nextInt(10);
			a = randy.nextInt(2) - randy.nextInt(2);
			b = randy.nextInt(2) - randy.nextInt(2);
			if ((x+y)%2 != (a+b)%2) {
				x++;
			}
			System.out.println("Grey foggy clouds float oppressively close to you, \r\n"
					+ "reflected in the murky grey water which reaches up your shins.\r\n"
					+ "Some black plants barely poke out of the shallow water.\r\n"
					+ "However you do not let this take your concentration away from your goal.\r\n"
					+ "you look at your small watch-like device in your left hand,  \r\n"
					+ "it tells you how far you are from the legendary master sword.\r\n"
					+ "It only shows the distance from the master sword. \r\n"
					+ "In your right hand is  a monster detector, \r\n"
					+ "it tells you your distance from the Beast which protects the sword. \r\n"
					+ "reach the sword before the Beast gets you. \r\n"
					+ "Try \"north\", \"south\", \"east\", or \"west\"\r\n"
					+ "\"north east\", \"south east\", \"north west\", or \"south west\"\r\n" + "");
			while (Math.hypot(x, y) != 0) {
				System.out.println("The compass reads " + format(Math.hypot(x, y)) + "m, the beast locator reads " + format(Math.hypot((x-a), (y-b))) + "m");
				String input = scan.nextLine();
				int xtemp = x;
				int ytemp = y;
				if (input.equals("north")) {
					x++;
				} else if (input.equals("south")) {
					x--;
				} else if (input.equals("east")) {
					y++;
				} else if (input.equals("west")) {
					y--;
				} else if (input.equals("north west")) {
					x++;
					y--;
				} else if (input.equals("north east")) {
					x++;
					y++;
				} else if (input.equals("south west")) {
					x--;
					y--;
				} else if (input.equals("south east")) {
					x--;
					y++;
				} else {
					System.out.println(
							"Input not recognised. Please Try \"north\", \"south\", \"east\", or \"west\"\r\n\""
									+ "\"north east\", \"south east\", \"north west\", or \"south west\"");
				}
				if (xtemp != x || ytemp != y) {
					String s = beastMove.beast();
					if (s.equals("north")) {
						a++;
					} else if (s.equals("south")) {
						a--;
					} else if (s.equals("east")) {
						b++;
					} else if (s.equals("west")) {
						b--;
					}
				}
				if (x == a && y == b) {
					x = 0;
					y = 0;
					a = 0;
					b = 0;
				}
			}
			if ((x == a && y == b)) {
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
