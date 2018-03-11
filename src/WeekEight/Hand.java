package WeekEight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {
	List<Card> hand = new ArrayList<Card>();

	public void add(Card card) {
		hand.add(card);
	}

	public void print() {
		for (Card h : hand) {
			System.out.println(h);
		}
	}

	public void sort() {
		Collections.sort(hand);
	}

	@Override
	public int compareTo(Hand o) {
		int sum1 = 0;
		int sum2 = 0;

		for (Card d : this.hand) {
			sum1 += d.getValue();
		}

		for (Card c : o.hand) {
			sum2 += c.getValue();

		}
		if (sum1 == sum2) {
			return 0;
		} else if (sum1 > sum2) {
			return 1;
		} else
			return -1;
	}

	public static void main(String[] args) {
		Hand hand1 = new Hand();

		hand1.add(new Card(2, Card.SPADES));
		hand1.add(new Card(14, Card.CLUBS));
		hand1.add(new Card(12, Card.HEARTS));
		hand1.add(new Card(2, Card.CLUBS));
		hand1.add(new Card(9, Card.CLUBS));

		Hand hand2 = new Hand();

		hand2.add(new Card(11, Card.DIAMONDS));
		hand2.add(new Card(11, Card.CLUBS));
		hand2.add(new Card(11, Card.HEARTS));

		int comparison = hand1.compareTo(hand2);

		if (comparison < 0) {
			System.out.println("the most valuable hand contains the cards");
			hand2.print();
		} else if (comparison > 0) {
			System.out.println("the most valuable hand contains the cards");
			hand1.print();
		} else {
			System.out.println("the hands are equally valuable");
		}

	}

}
