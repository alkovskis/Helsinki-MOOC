package WeekFive;

public class Player {
	String playerName;
	int amountOfGoals;

	public Player(String playerName) {
		this.playerName = playerName;

	}

	public Player(String playerName, int amountOfGoals) {
		this.playerName = playerName;
		this.amountOfGoals = amountOfGoals;
	}

	public String getPlayerName() {
		return playerName;
	}

	public int getAmountOfGoals() {
		return amountOfGoals;
	}
	public String toString() {
		return playerName+", goals "+amountOfGoals;
	}

}
