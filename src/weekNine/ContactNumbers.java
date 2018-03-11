package weekNine;

import java.util.*;

public class ContactNumbers implements Contact {

	private Map<String, Set<String>> contacts;

	public ContactNumbers() {
		this.contacts = new HashMap<String, Set<String>>();
	}

	public void printContact(String name) {
		if (!contacts.containsKey(name)) {
			System.out.println("  not found");
		} else
			for (String s : contacts.get(name)) {
				System.out.println(s);
			}
	}

	public void printContactValue(String number) {

	}

	@Override
	public void addContact(String name, String contact) {
		if (!this.contacts.containsKey(name)) {
			this.contacts.put(name, new HashSet<String>());
		}
		this.contacts.get(name).add(contact);

	}

}
