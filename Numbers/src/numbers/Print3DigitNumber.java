package numbers;

public class Print3DigitNumber {

	public String printNumber(int a) {
		String hundreds = "";
		String tens = "";
		String units = "";
		if (a == 100) {
			hundreds = "one hundred";
		} else if (a == 200) {
			hundreds = "two hundred";
		} else if (a == 300) {
			hundreds = "three hundred";
		} else if (a == 400) {
			hundreds = "four hundred";
		} else if (a == 500) {
			hundreds = "five hundred";
		} else if (a == 600) {
			hundreds = "six hundred";
		} else if (a == 700) {
			hundreds = "seven hundred";
		} else if (a == 800) {
			hundreds = "eight hundred";
		} else if (a == 900) {
			hundreds = "nine hundred";
		} else if (a % 100 == 10) {
			tens = "ten";
		} else if (a % 100 == 11) {
			tens = "eleven";
		} else if (a % 100 == 12) {
			tens = "twelve";
		} else if (a % 100 == 13) {
			tens = "thirteen";
		} else if (a % 100 == 14) {
			tens = "fourteen";
		} else if (a % 100 == 15) {
			tens = "fifteen";
		} else if (a % 100 == 16) {
			tens = "sixteen";
		} else if (a % 100 == 17) {
			tens = "seventeen";
		} else if (a % 100 == 18) {
			tens = "eighteen";
		} else if (a % 100 == 19) {
			tens = "nineteen";
		} else if (a % 100 == 1) {
			units = "one";
		} else if (a % 100 == 2) {
			units = "two";
		} else if (a % 100 == 3) {
			units = "three";
		} else if (a % 100 == 4) {
			units = "four";
		} else if (a % 100 == 5) {
			units = "five";
		} else if (a % 100 == 6) {
			units = "six";
		} else if (a % 100 == 7) {
			units = "seven";
		} else if (a % 100 == 8) {
			units = "eight";
		} else if (a % 100 == 9) {
			units = "nine";
		} else {
			if (a % 10 == 1) {
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
			if ((a - (a % 10)) % 100 == 0) {
				tens = "";
			} else if ((a - (a % 10)) % 100 == 20) {
				tens = "twenty";
			} else if ((a - (a % 10)) % 100 == 30) {
				tens = "thirty";
			} else if ((a - (a % 10)) % 100 == 40) {
				tens = "fourty";
			} else if ((a - (a % 10)) % 100 == 50) {
				tens = "fifty";
			} else if ((a - (a % 10)) % 100 == 60) {
				tens = "sixty";
			} else if ((a - (a % 10)) % 100 == 70) {
				tens = "seventy";
			} else if ((a - (a % 10)) % 100 == 80) {
				tens = "eighty";
			} else if ((a - (a % 10)) % 100 == 90) {
				tens = "ninty";
			}
			if (a - (a % 100) == 0) {
				hundreds = "";
			} else if (a - (a % 100) == 100) {
				hundreds = "one hundred and ";
			} else if (a - (a % 100) == 200) {
				hundreds = "two hundred and ";
			} else if (a - (a % 100) == 300) {
				hundreds = "three hundred and ";
			} else if (a - (a % 100) == 400) {
				hundreds = "four hundred and ";
			} else if (a - (a % 100) == 500) {
				hundreds = "five hundred and ";
			} else if (a - (a % 100) == 600) {
				hundreds = "six hundred and ";
			} else if (a - (a % 100) == 700) {
				hundreds = "seven hundred and ";
			} else if (a - (a % 100) == 800) {
				hundreds = "eight hundredand ";
			} else if (a - (a % 100) == 900) {
				hundreds = "nine hundredand ";
			}
		}
		return hundreds + tens + units;

	}

}
