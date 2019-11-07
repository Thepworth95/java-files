package numbers;

public class Print2DigitNumber {

	public String printNumber(int a) {
		String tens = null;
		String units = null;
		if (a == 10) {
			tens = "ten";
			units = "";
		} else if (a == 11) {
			tens = "eleven";
			units = "";
		} else if (a == 12) {
			tens = "twelve";
			units = "";
		} else if (a == 13) {
			tens = "thirteen";
			units = "";
		} else if (a == 14) {
			tens = "fourteen";
			units = "";
		} else if (a == 15) {
			tens = "fifteen";
			units = "";
		} else if (a == 16) {
			tens = "sixteen";
			units = "";
		} else if (a == 17) {
			tens = "seventeen";
			units = "";
		} else if (a == 18) {
			tens = "eighteen";
			units = "";
		} else if (a == 19) {
			tens = "nineteen";
			units = "";
		} else {
			if (a % 10 == 0) {
				units = "";
			} else if (a % 10 == 1) {
				units = "-one";
			} else if (a % 10 == 2) {
				units = "-two";
			} else if (a % 10 == 3) {
				units = "-three";
			} else if (a % 10 == 4) {
				units = "-four";
			} else if (a % 10 == 5) {
				units = "-five";
			} else if (a % 10 == 6) {
				units = "-six";
			} else if (a % 10 == 7) {
				units = "-seven";
			} else if (a % 10 == 8) {
				units = "-eight";
			} else if (a % 10 == 9) {
				units = "-nine";
			}
			if (a-(a%10) == 0) {
				tens = "";
			} else if (a-(a%10) == 20) {
				tens = "twenty";
			} else if (a-(a%10) == 30) {
				tens = "thirty";
			} else if (a-(a%10) == 40) {
				tens = "fourty";
			} else if (a-(a%10) == 50) {
				tens = "fifty";
			} else if (a-(a%10) == 60) {
				tens = "sixty";
			} else if (a-(a%10) == 70) {
				tens = "seventy";
			} else if (a-(a%10) == 80) {
				tens = "eighty";
			} else if (a-(a%10) == 90) {
				tens = "ninty";
			} 
		}

		return tens + units;
	}

}
