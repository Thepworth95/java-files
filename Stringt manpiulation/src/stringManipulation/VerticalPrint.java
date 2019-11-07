package stringManipulation;

public class VerticalPrint {
	public String vertical(String s) {
		String vert = null;
		if (s.equals(null)) {
			vert = null;
		} else {
			vert = s.substring(0, 1);
			for (int i = 2; i <= s.length(); i++) {
				if (s.substring(i - 1, i).equals(" ")) {
					vert = vert + "\r\n";
				}else 
					vert = vert + s.substring(i - 1, i);
			}
		}
		
		return vert;
	}
}
