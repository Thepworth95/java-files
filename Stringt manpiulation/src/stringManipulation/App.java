package stringManipulation;

public class App {

	public static void main(String[] args) {

		Count lengthOfString = new Count();

		System.out.println(lengthOfString.count("this is a string"));
		System.out.println(lengthOfString.count("this is a longer string"));
		
		VerticalPrint vert = new 	VerticalPrint();
		System.out.println(vert.vertical("this is a string"));
		System.out.println(vert.vertical("this is a longer string"));
	}
}