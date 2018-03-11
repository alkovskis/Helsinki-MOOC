package dungeon;

import java.util.ArrayList;
import java.util.Scanner;

public class Dungeon {

	private GameGrid gameGrid;
	private int moves;
	Scanner scanner;

	public Dungeon(int length, int height, int vampires, int moves, boolean vampiresMove) {
		this.gameGrid = new GameGrid(length, height, vampires, vampiresMove);
		this.moves = moves;
		this.scanner = new Scanner(System.in);
	}

	public void run() {
		int i = moves;
		System.out.println(i);
		gameGrid.printGrid();
		while (i > 0) {
			if (this.gameGrid.returnCharacters().size() == 1) {
				break;
			}
			String input = scanner.nextLine();
			ArrayList<String> commands = new ArrayList<String>();
			for (int y = 0; y < input.length(); y++) {
				commands.add(input.substring(y, y + 1));
			}
			this.gameGrid.moveAndRemoveCharacters(commands);
			i--;
			System.out.println(i);
			gameGrid.printGrid();

			if (this.gameGrid.returnCharacters().size() == 1) {
				System.out.println("YOU WON!!");
			} else
				System.out.println("YOU LOSE!!");
		}
	}

}
