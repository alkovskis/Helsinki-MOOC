package WeekTwelve;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
	private List<Person> list;

	public Employees() {
		list = new ArrayList<Person>();
	}

	public void add(Person person) {
		list.add(person);
	}

	public void add(List<Person> persons) {
		for (Person p : persons) {
			this.list.add(p);
		}

	}

	public void print() {
		Iterator<Person> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public void print(Education education) {
		Iterator<Person> iterator = list.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getEducation() == education) {
				System.out.println(iterator.next());
			}
		}
	}

	public void fire(Education education) {
		Iterator<Person> iterator = list.iterator();
		while (iterator.hasNext()) {
			if (iterator.next().getEducation() == education) {
				iterator.remove();
			}
		}
	}

	public static void main(String[] args) {
		Employees university = new Employees();
		university.add(new Person("Matti", Education.D));
		university.add(new Person("Pekka", Education.GRAD));
		university.add(new Person("Arto", Education.D));

		university.print();

		university.fire(Education.GRAD);

		System.out.println("==");

		university.print();
	}
}
