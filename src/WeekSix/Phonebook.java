package WeekSix;

import java.util.ArrayList;

public class Phonebook {
	private ArrayList<Person> persons = new ArrayList<Person>();

	public void add(String name, String number) {
		persons.add(new Person(name, number));
	}

	public void printAll() {
		for (Person p : persons) {
			System.out.println(p);
		}
	}

	public String searchNumber(String name) {
		String answer = "number not known";
		for (Person p : persons)
			if (p.getName().contains(name)) {
				answer = p.getNumber();
			}
		return answer;
	}

	public static void main(String[] args) {
		Phonebook phonebook = new Phonebook();
		phonebook.add("Pekka Mikkola", "040-123123");
		phonebook.add("Edsger Dijkstra", "045-456123");
		phonebook.add("Donald Knuth", "050-222333");

		String number = phonebook.searchNumber("Pekka Mikkola");
		System.out.println(number);

		number = phonebook.searchNumber("Martti Tienari");
		System.out.println(number);
	}
}
