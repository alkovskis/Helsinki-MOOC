package people;

public class Student extends Person {

	private int credits;

	public Student(String name, String adress) {
		super(name, adress);
	}

	public int study() {
		return credits++;
	}

	public int credits() {
		return this.credits;
	}

	public String toString() {
		return super.toString() + "\n" + "  credits " + this.credits;
	}

	public static void main(String[] args) {
		Person olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println( olli );
        //olli.study();
        System.out.println( olli );

	}

}
