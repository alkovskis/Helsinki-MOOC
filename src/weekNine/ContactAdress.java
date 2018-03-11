package weekNine;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContactAdress implements Contact {

	private Map<String, Set<String>> adress;

	public ContactAdress() {
		this.adress = new HashMap<String, Set<String>>();
	}

	@Override
	public void addContact(String name, String contact) {
		if (!this.adress.containsKey(name)) {
			this.adress.put(name, new HashSet<String>());
		}
		this.adress.get(name).add(contact);

	}

	void printContact(String name) {
		if (!adress.containsKey(name)) {
			System.out.println("  not found");
		} else
			for (String s : adress.get(name)) {
				System.out.print(s);
			}
		System.out.println();
		
	}

}
