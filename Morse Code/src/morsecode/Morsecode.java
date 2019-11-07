package morsecode;

import java.util.HashMap;

public class Morsecode {

	public void code(String s) {

		HashMap<String, String> map = new HashMap<>();
		map.put(".-", "a");
		map.put("-...", "b");
		map.put("-.-.", "c");
		map.put("-..", "d");
		map.put(".", "e");
		map.put("..-.", "f");
		map.put("--.", "g");
		map.put("....", "h");
		map.put("..", "i");
		map.put(".---", "j");
		map.put("-.-", "k");
		map.put(".-..", "l");
		map.put("--", "m");
		map.put("-.", "n");
		map.put("---", "o");
		map.put(".--.", "p");
		map.put("--.-", "q");
		map.put(".-.", "r");
		map.put("...", "s");
		map.put("-", "t");
		map.put("..-", "u");
		map.put("...-", "v");
		map.put(".--", "w");
		map.put("-..-", "x");
		map.put("-.--", "y");
		map.put("--..", "z");
		map.put("-----", "0");
		map.put(".----", "1");
		map.put("..---", "2");
		map.put("...--", "3");
		map.put("....-", "4");
		map.put(".....", "5");
		map.put("-....", "6");
		map.put("--...", "7");
		map.put("---..", "8");
		map.put("----.", "9");
		map.put("/", " ");

		String a = "";

		for (int i = 1; i <= s.length(); i++) {
			
			if (s.substring(i - 1, i).equals(" ")) {
				
				System.out.print(map.get(a));
				a = "";
			} else {
				a = a + s.substring(i - 1, i);
			}
		}
		System.out.print(map.get(a));
		
	}
}
