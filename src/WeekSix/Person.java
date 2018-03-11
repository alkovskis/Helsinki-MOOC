package WeekSix;

public class Person {

	private String number;
	private String name;

	public Person(String name, String number) {
		this.name = name;
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void changeNumber(String number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return this.name + " number: " + this.number;
	}

	public static void main(String[] args) {
		Person pekka = new Person("Pekka Mikkola", "040-123123");

		System.out.println(pekka.getName());
		System.out.println(pekka.getNumber());

		System.out.println(pekka);
		pekka.changeNumber("050-333444");
		System.out.println(pekka);
	}

}
