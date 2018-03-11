package WeekEight;

public class Card implements Comparable<Card> {
	public static final int SPADES = 0;
	public static final int DIAMONDS = 1;
	public static final int HEARTS = 2;
	public static final int CLUBS = 3;

	public static final String[] VALUES = { "-", "-", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K",
			"A" };
	public static final String[] SUITS = { "Spades", "Diamonds", "Hearts", "Clubs" };
	public int value;
	public int suit;
	

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Card(int value, int suit) {
		this.value = value;
		this.suit = suit;

	}

	public String toString() {
		return VALUES[value] + " of " + SUITS[suit];

	}

	@Override
	public int compareTo(Card o) {
		int answer = 0;
		if (this.value == o.value) {
			if (this.suit > o.suit) {
				answer = 1;
			}

		} else if (this.value > o.value) {
			answer = 1;
		} else
			answer = -1;
		return answer;
	}

	public static void main(String[] args) {

		Card first = new Card(2, Card.DIAMONDS);
		Card second = new Card(14, Card.CLUBS);
		Card third = new Card(12, Card.HEARTS);

	}

}
