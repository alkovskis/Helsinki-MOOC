package dictionary;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Translate implements MultipleEntryDictionary {

	private Map<String, Set<String>> words;

	public Translate() {
		this.words = new HashMap<String, Set<String>>();
	}

	@Override
	public void add(String word, String translation) {
		if (!this.words.containsKey(word)) {
			this.words.put(word, new HashSet<String>());
		}
		this.words.get(word).add(translation);

	}

	@Override
	public Set<String> translate(String word) {
		if (words.containsKey(word)) {
			return words.get(word);
		} else
			return null;
	}

	@Override
	public void remove(String word) {
		if (words.containsKey(word)) {
			words.remove(word);
		}

	}

	public static void main(String[] args) {
		MultipleEntryDictionary dict = new Translate();
		dict.add("kuusi", "six");
		dict.add("kuusi", "spruce");

		dict.add("pii", "silicon");
		dict.add("pii", "pi");

		System.out.println(dict.translate("kuusi"));
		dict.remove("pii");
		System.out.println(dict.translate("pii"));

	}

}
