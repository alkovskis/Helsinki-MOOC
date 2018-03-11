package WeekEight;

import java.util.Random;

public class JudgeVote implements Comparable<JudgeVote> {

	private int vote;
	Random random = new Random();

	public int createVote() {
		return this.vote = random.nextInt(20 + 1 - 10) + 10;
	}
	
	
	public String toString() {
		return ""+this.vote;
	}

	@Override
	public int compareTo(JudgeVote o) {
		if (this.vote == o.vote) {
			return 0;
		} else if (this.vote > o.vote) {
			return 1;
		} else
			return 0;
	}

}
