package tools;

import java.util.HashSet;
import java.util.Set;

public class PersonalDuplicateRemover implements DuplicateRemover {

	private String word;
	private Set<String> unique;
	int duplicate = 0;

	public PersonalDuplicateRemover() {
		this.unique = new HashSet<String>();
	}

	@Override
	public void add(String characterString) {
		if (this.unique.contains(characterString)) {
			duplicate++;
		}
		this.unique.add(characterString);

	}

	@Override
	public int getNumberOfDetectedDuplicates() {

		return this.duplicate;
	}

	@Override
	public Set<String> getUniqueCharacterStrings() {
		return unique;
	}

	@Override
	public void empty() {
		duplicate=0;
		this.unique.removeAll(unique);

	}

	public static void main(String[] args) {
		DuplicateRemover remover = new PersonalDuplicateRemover();
		remover.add("first");
		remover.add("second");
		remover.add("first");

		System.out.println("Current number of duplicates: " + remover.getNumberOfDetectedDuplicates());

		remover.add("last");
		remover.add("last");
		remover.add("new");

		System.out.println("Current number of duplicates: " + remover.getNumberOfDetectedDuplicates());

		System.out.println("Unique characterStrings: " + remover.getUniqueCharacterStrings());

		remover.empty();

		System.out.println("Current number of duplicates: " + remover.getNumberOfDetectedDuplicates());

		System.out.println("Unique characterStrings: " + remover.getUniqueCharacterStrings());

	}

}
