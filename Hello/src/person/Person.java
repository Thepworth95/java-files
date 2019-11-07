package person;

public class Person {
/*	public static Object numberofobjects;*/
	private String Name;
	private int Age;
	private String Job;

	public Person(String Name, int Age, String Job) {
		this.Name = Name;
		this.Age = Age;
		this.Job = Job;
	}
	@Override
	public String toString() {
		return Name + "[Age=" + Age + ", Job=" + Job + "]";
	}

	public void setName(String Name) {
		this.Name = Name;
	}

	public void setAge(int Age) {
		this.Age = Age;
	}

	public void setJob(String Job) {
		this.Job = Job;
	}

	public String getName() {
		return Name;
	}
	
	public int getAge() {
		return Age;
	}
	
	public String getJob() {
		return Job;
	}

}
