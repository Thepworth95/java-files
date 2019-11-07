package person;

import java.util.ArrayList;
import java.util.List;

public class PersonMain {
	public static void main(String[] args) {
		Person Person1 = new Person("Name1", 24, "Job1");
		Person Person2 = new Person("Name2", 26, "Job2");
		Person Person3 = new Person("Name3", 22, "Job3");
		Person Person4 = new Person("Name4", 21, "Job4");
		Person Person5 = new Person("name5", 29, "Job5");
		Person Person6 = new Person("Name6", 51, "Job6");

		List<Person> listPeople = new ArrayList<>();
		/* for (i = 1, i < Person.numberofobjects, i++) { */
		listPeople.add(Person1);
		listPeople.add(Person2);
		listPeople.add(Person3);
		listPeople.add(Person4);
		listPeople.add(Person5);
		listPeople.add(Person6);

		for (Person person : listPeople) {
			System.out.println(person);
		}

		for (Person person : listPeople) {
			if (person.getName() == "Name2") {
				System.out.println(person);
			}
		}
	}

}
