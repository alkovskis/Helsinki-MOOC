package weekNine;

import java.util.Scanner;

public class PhoneSearch {

	Scanner reader = new Scanner(System.in);
	ContactNumbers contact = new ContactNumbers();
	ContactAdress adress = new ContactAdress();

	public void printText() {
		System.out.println("phone search");
		System.out.println("available operations:");
		System.out.println("1 add a number");
		System.out.println("2 search for a number");
		System.out.println("3 search for a person by phone number");
		System.out.println("4 add an address");
		System.out.println("5 search for personal information");
		System.out.println("6 delete personal information");
		System.out.println("7 filtered listing");
		System.out.println("x quit");
		System.out.println();
	}

	public void chooseNumber() {
		printText();
		while (true) {
			System.out.print("Command: ");
			String text = reader.nextLine();

			switch (text) {
			case "1":
				System.out.print("whose number: ");
				String name = reader.nextLine();
				System.out.print("number: ");
				String number = reader.nextLine();
				contact.addContact(name, number);
				break;
			case "2":
				System.out.print("whose number: ");
				name = reader.nextLine();
				contact.printContact(name);
				break;
			case "3":
				System.out.print("number: ");
				// neuzbaigta
				break;
			case "4":
				System.out.print("whose address: ");
				name = reader.nextLine();
				System.out.print("street: ");
				String street = reader.nextLine();
				System.out.print("city: ");
				String city = reader.nextLine();
				String fullAdress = street + " " + city;
				adress.addContact(name, fullAdress);
				break;
			case "5":
				System.out.print("whose number: ");
				name = reader.nextLine();
				System.out.print("adress: ");
				adress.printContact(name);
				System.out.print("phone numbers: ");
				System.out.println();
				contact.printContact(name);
				break;

			}

		}
	}

}
