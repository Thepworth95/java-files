package Results;

public class MainPercentage {

	public static void main(String[] args) {

		Results tom = new Results();
		tom.name = "Tom";
		tom.physics = 132;
		tom.chemistry = 87;
		tom.biology = 59;
		tom.total = tom.physics + tom.chemistry + tom.biology;
		tom.percentage = (tom.total * 100) / 450;

		if (tom.percentage >= 60 && tom.biology >= 60 && tom.chemistry >= 60 && tom.physics >= 60) {
			System.out.println("Percentage:" + tom.percentage);
		} else if(tom.percentage < 60) {
			System.out.println("Student failed overall");
		} else if(tom.biology >= 60 || tom.chemistry >= 60 || tom.physics >= 60) {
			System.out.println("Student failed individual module");
		}
	}
}
