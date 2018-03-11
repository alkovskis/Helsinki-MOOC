package WeekFive;

import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	String name;
	String studentNumber;

	public Student(String name, String studentNumber) {
		this.name = name;
		this.studentNumber = studentNumber;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentNumber() {
		return this.studentNumber;
	}

	public String toString() {
		return this.name + " (" + this.studentNumber + ")";
	}

	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<Student>();
		Scanner scanner = new Scanner(System.in);
		while (true) {

			System.out.print("name: ");

			String name = scanner.nextLine();
			if (name.equals("")) {
				break;
			}
			System.out.print("studentnumbder: ");
			String number = scanner.nextLine();
			list.add(new Student(name, number));

		}
		for (Student printList : list) {
			System.out.println(printList);
		}
		String search;

		System.out.println("Give search term: ");
		search = scanner.nextLine();
		System.out.println("Results: ");
		for(Student s:list) {
			if(s.getName().contains(search)) {
				System.out.println(s);
			}
		}

	}

}
