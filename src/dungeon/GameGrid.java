package dungeon;

import java.util.ArrayList;

public class GameGrid {

	private int length;
	private int height;
	private boolean vampireMove;
	private ArrayList<String> gameGrid;
	private Characters characters;

	public GameGrid(int length, int height, int vampiresNumber, boolean vampiresMove) {
		this.characters = new Characters(length, height, vampiresNumber);
		this.length = length;
		this.height = height;
		this.vampireMove = vampiresMove;
		this.gameGrid = new ArrayList<String>();
	}

	public ArrayList<Character> returnCharacters() {
		return this.characters.returnCharacters();
	}

	public void moveAndRemoveCharacters(ArrayList<String> moves) {
		this.characters.moveAndRemoveCharacters(moves, this.vampireMove);

	}

	public void createGrid() {
		gameGrid.clear();
		ArrayList<Character> players = characters.returnCharacters();
		for (int x = 0; x < length; x++) {
			ArrayList<Character> playersOnY = new ArrayList<Character>();
			for (Character ch : players) {
				if (ch.getX() == x) {
					playersOnY.add(ch);
				}
			}
			String line = "";
			for (int y = 0; y < length; y++) {
				boolean containsPlayer = false;
				for (Character c : playersOnY) {
					if (c.getY() == y) {
						line += c.getName();
						containsPlayer = true;
					}
				}
				if (containsPlayer == false) {
					line += ".";
				}
			}
			gameGrid.add(line);
		}
	}

	public void printGrid() {
		System.out.println();
		this.characters.printCharacters();
		System.out.println();
		createGrid();
		for (String g : this.gameGrid) {
			System.out.println(g);
		}
		System.out.println();

	}

}
