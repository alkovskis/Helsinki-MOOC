package WeekFive;

import java.util.Calendar;

public class Person {

	private String name;
	private MyDate birthday;

	public Person(String name, int pp, int kk, int vv) {
		this.name = name;
		this.birthday = new MyDate(pp, kk, vv);
	}

	public int age() {
		int day = Calendar.getInstance().get(Calendar.DATE);
		int month = Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
		int year = Calendar.getInstance().get(Calendar.YEAR);
		MyDate today = new MyDate(day, month, year);
		return birthday.differenceInYears(today);

	}

	public String getName() {
		return this.name;
	}

	public boolean olderThan(Person compared) {
		if (birthday.getYear() - compared.birthday.getYear() < 0) {
			return true;

		} else if (birthday.getYear() - compared.birthday.getYear() <= 0
				&& birthday.getMonth() - compared.birthday.getMonth() <= 0) {
			return true;
		} else
			return false;
	}

	public String toString() {
		return this.name + ", born " + this.birthday;
	}

	public static void main(String[] args) {
		Person pekka = new Person("Pekka", 15, 2, 1983);
		Person martin = new Person("Martin", 1, 3, 1983);

		System.out.println(martin.getName() + " is older than " + pekka.getName() + ": " + martin.olderThan(pekka));
		System.out.println(pekka.getName() + " is older than " + martin.getName() + ": " + pekka.olderThan(martin));
	}
}
