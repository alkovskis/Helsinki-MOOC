package dungeon;

import java.util.ArrayList;

public abstract class Character {

	String name;
	int length;
	int height;
	int x;
	int y;

	public Character(String name, int length, int height) {
		this.name = name;
		this.length = length;
		this.height = height;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void move(ArrayList<String> moves) {

	}

	public void move(int moves, boolean vampiresMove) {

	}

	@Override
	public String toString() {
		return this.name + " " + this.x + " " + this.y;
	}

}
