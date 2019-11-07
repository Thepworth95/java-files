package Results;

public class Results {
	
	String name;
	int physics;
	int chemistry;
	int biology;
	int total;
	double percentage;




	
	public static void main(String[] args) {

		Results tom = new Results();
		tom.name = "Tom";
		tom.physics = 80;
		tom.chemistry = 150;
		tom.biology = 59;
		tom.total = tom.physics + tom.chemistry + tom.biology ;
		tom.percentage = (tom.total * 100) / 450;
			
		System.out.println("Name:" + tom.name);
		System.out.println("Physics:" + tom.physics);
		System.out.println("Chemistry:" + tom.chemistry);
		System.out.println("Biology:" + tom.biology);
		System.out.println("Total:" + tom.total);
		System.out.println("Percentage:" + tom.percentage);
		if (tom.percentage >= 60 && tom.biology >= 60 && tom.chemistry >= 60 && tom.physics >= 60) {
			System.out.println("Percentage:" + tom.percentage);
		} else if(tom.percentage < 60) {
			System.out.println("Student failed overall");
		} else if(tom.biology >= 60 || tom.chemistry >= 60 || tom.physics >= 60) {
			System.out.println("Student failed individual module");
		}
		if (tom.biology < 60 || tom.chemistry < 60 || tom.physics < 60) {
			System.out.println("module's failed:");
		}
		if (tom.physics < 60) {
			System.out.println("-Physics");
		}
		if (tom.chemistry < 60) {
			System.out.println("-Chemistry");
		}
		if (tom.biology < 60) {
			System.out.println("-Biology");
		}
	}
}



