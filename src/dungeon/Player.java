package dungeon;

import java.util.ArrayList;

public class Player extends Character {

	public Player(String name, int length, int height) {
		super(name, length, height);
		this.x = 0;
		this.y = 0;
	}
	

	@Override
	public void move(ArrayList<String> moves) {
		for (String m : moves) {
			if (m.equals("w") && this.y - 1 >= 0) {
				this.y -= y;
			} else if (m.equals("s") && this.y + 1 <= this.height) {
				this.y += y;
			} else if (m.equals("a") && this.x - 1 >= 0) {
				this.x -= x;
			} else if (m.equals("d") && this.x + 1 <= this.length) {
				this.x += x;
			}
		}
	}

}
