package people;

public class Person {

	private String name;
	private String adress;

	public Person(String name, String adress) {
		this.name = name;
		this.adress = adress;
	}

	public String toString() {
		return this.name + "\n" + "  " + this.adress;
	}

	public static void main(String[] args) {
		 Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
	        Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
	        System.out.println(pekka);
	        System.out.println(esko);

	}

}
