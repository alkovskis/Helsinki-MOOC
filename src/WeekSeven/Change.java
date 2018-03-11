package WeekSeven;

public class Change {
	char fromCharacter;
	char toCharacter;
	String word = "";

	public Change(char fromCharacter, char toCharacter) {
		this.fromCharacter = fromCharacter;
		this.toCharacter = toCharacter;
	}

	public String change(String characterString) {
		String replaced = "";
		for (int i = 0; i < characterString.length(); i++) {
			char character = characterString.charAt(i);
			if (fromCharacter == characterString.charAt(i)) {
				replaced += toCharacter;
			} else
				replaced += character;
		}
		return this.word = replaced;
	}

	public static void main(String[] args) {
		String word = "carrot";
		Change change1 = new Change('a', 'b');
		word = change1.change(word);

		System.out.println(word);

		Change Change2 = new Change('r', 'x');
		word = Change2.change(word);

		System.out.println(word);

	}

}
