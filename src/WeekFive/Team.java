package WeekFive;

import java.util.ArrayList;

public class Team {
	private String name;
	private ArrayList<Player> list = new ArrayList<Player>();
	private int maxSize = 16;

	public Team(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void addPlayer(Player p) {
		if (list.size() <= maxSize) {
			list.add(p);
		}
	}

	public void printPlayers() {
		for (Player a : list) {
			System.out.println(a);
		}
	}

	public void setMaxSize(int maxSize) {
		this.maxSize = maxSize;

	}

	public int size() {
		return list.size();
	}
	public int goals() {
		int sum=0;
		int goal=0;
		for(Player a:list) {
			goal= a.getAmountOfGoals();
			sum+=goal;
		}
		
		return sum;
		
		
	}

	public static void main(String[] args) {

		 Team barcelona = new Team("FC Barcelona");
	        barcelona.setMaxSize(8);

	        Player brian = new Player("Brian");
	        Player pekka = new Player("Pekka", 59);
	        barcelona.addPlayer(brian);
	        barcelona.addPlayer(pekka);
	        barcelona.addPlayer(new Player("Mikael", 1)); // works similarly as the above

	        System.out.println("Number of players: " + barcelona.size());
	        barcelona.printPlayers();
	        System.out.println("Total goals: " + barcelona.goals());
	}

}
