package WeekEight;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class Statistic {

	private int length;
	Random random = new Random();
	private List<Integer> votes = new ArrayList<Integer>();
	private JudgeVote v = new JudgeVote();
	public int points;

	public int lengthOfJump() {
		length = random.nextInt(120 + 1 - 60) + 60;
		return length;
	}

	public int getLength() {
		return this.length;
	}

	public void addJudgeVotes() {
		for (int i = 0; i < 5; i++) {
			votes.add(v.createVote());
		}
	}

	public void removeJudgeVotes() {
		votes.removeAll(votes);
	}

	public void printVotes() {
		System.out.print("   judge votes: ");
		for (int i = 0; i < votes.size(); i++) {
			if (i == 0) {
				System.out.print("[" + votes.get(i) + ", ");
			} else if (i > 0 && i < votes.size() - 1) {
				System.out.print(votes.get(i) + ", ");
			} else
				System.out.print(votes.get(i) + "]");
		}
		System.out.println();
	}

	public void viewVotes() {
		removeJudgeVotes();
		addJudgeVotes();
		printVotes();
	}

	public void sortVotes() {
		Collections.sort(votes);
	}

	public void printStat() {
		System.out.println("   length: " + lengthOfJump());
		viewVotes();
		System.out.println();
	}

	public int sumOfVotes() {
		sortVotes();
		int sum = 0;
		for (int i = 1; i < votes.size() - 1; i++) {
			sum += votes.get(i);
		}
		System.out.println(sum);
		return sum;
	}

	public void sumOfPoints() {
		this.points = this.length + sumOfVotes();
	}

}
