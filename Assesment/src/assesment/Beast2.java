package assesment;

import java.util.Random;

public class Beast2 {

		private int xcoord;
		private int ycoord;

		public Beast2(int xcoord, int ycoord) {
			super();
			this.xcoord = xcoord;
			this.ycoord = ycoord;
		}
		
			public int getXcoord() {
			return xcoord;
		}
			
		public void setXcoord(int xcoord) {
			this.xcoord = xcoord;
		}
		
		public int getYcoord() {
			return ycoord;
		}
		
		public void setYcoord(int ycoord) {
			this.ycoord = ycoord;
		}
		
		public static String beastMovement() {
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
