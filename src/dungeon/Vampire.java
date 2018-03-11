package dungeon;

import java.util.Random;

public class Vampire extends Character {

	Random random = new Random();

	public Vampire(String name, int length, int height) {
		super(name, length, height);
		this.x = random.nextInt(length);
		this.y = random.nextInt(height);
	}

	@Override
	public void move(int moves, boolean vampireMoves) {
		if (vampireMoves) {
			for (int i = 0; i < moves; i++) {
				int rand = random.nextInt(4);
				if (rand == 0 && this.y - 1 >= 0) {
					this.y -= y;
				} else if (rand == 1 && this.y + 1 <= this.height) {
					this.y += y;
				} else if (rand == 2 && this.x - 1 >= 0) {
					this.x -= x;
				} else if (rand == 3 && this.x + 1 <= this.length) {
					this.x += x;
				}
			}
		}

	}

}
