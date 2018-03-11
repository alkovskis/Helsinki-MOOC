package weekNine;

import java.util.ArrayList;
import java.util.List;

public class PhoneBook {

	private List<ContactNumbers> listOfNumbers;

	public PhoneBook() {
		this.listOfNumbers = new ArrayList<ContactNumbers>();
	}

	public void addToList(ContactNumbers cont) {
		this.listOfNumbers.add(cont);

	}

	public void removeFromList(ContactNumbers cont) {
		this.listOfNumbers.remove(cont);
	}

	public List<ContactNumbers> printList() {
		return this.listOfNumbers;
	}

}
