package WeekSeven;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {

	HashMap<String, String> words = new HashMap<String, String>();

	public String translate(String word) {
		if (this.words.containsKey(word)) {
			return this.words.get(word);
		}
		return null;
	}

	public void add(String word, String translation) {
		this.words.put(word, translation);
	}

	public int amountOfWords() {
		return words.size();
	}

	public ArrayList<String> translationList() {
		ArrayList<String> list = new ArrayList<String>();
		for (String key : this.words.keySet()) {
			String a = (key + " = " + words.get(key));
			list.add(a);
		}
		return list;
	}

	public static void main(String[] args) {
		Dictionary dictionary = new Dictionary();
		dictionary.add("apina", "monkey");
		dictionary.add("banaani", "banana");
		dictionary.add("cembalo", "harpsichord");

		ArrayList<String> translations = dictionary.translationList();
		for (String translation : translations) {
			System.out.println(translation);
		}

	}

}
