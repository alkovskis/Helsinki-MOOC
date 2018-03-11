package dungeon;

import java.util.ArrayList;

public class Characters {

	ArrayList<Character> characters;

	public Characters(int length, int height, int vampires) {
		this.characters = new ArrayList<Character>();
		Player player = new Player("@", length, height);
		characters.add(player);
		int i = 0;
		while (i <= vampires) {
			Vampire vampire = new Vampire("v", length, height);
			i++;
			if (!characters.contains(vampire)) {
				characters.add(vampire);
			}
		}
	}

	public ArrayList<Character> returnCharacters() {
		return characters;
	}

	public void printCharacters() {
		for (Character c : characters) {
			System.out.println(c);
		}
	}

	public void moveAndRemoveCharacters(ArrayList<String> moves, boolean vampiresMove) {
		ArrayList<Character> movedVampires = new ArrayList<Character>();
		Character player = new Player("", 0, 0);
		for (Character c : characters) {
			if (c.getName().equals("@")) {
				c.move(moves);
				player = c;
			} else {
				c.move(moves.size(), vampiresMove);
				if (!movedVampires.contains(c)) {
					movedVampires.add(c);
				}
			}
		}
		ArrayList<Character> toBeRemoved = new ArrayList<Character>();
		for (Character vamp : movedVampires) {
			if (vamp.equals(player)) {
				toBeRemoved.add(vamp);
			}
		}
		movedVampires.remove(toBeRemoved);
		characters.clear();
		characters.add(player);
		characters.addAll(movedVampires);

	}
}
