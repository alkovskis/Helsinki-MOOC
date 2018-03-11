package WeekEight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class SkiJump {

	private List<Jumper> jumpers = new ArrayList<Jumper>();
	private Scanner reader = new Scanner(System.in);
	int round;
	Statistic stat=new Statistic();

	public void addJumper(Jumper jumper) {
		jumpers.add(jumper);
	}

	public void printJumpers() {
		for (Jumper j : jumpers) {
			System.out.println(j);
		}
	}

	public void results() {
		
		for (Jumper j : jumpers) {
			System.out.println(j.getName());
			stat.printStat();
		}
	}

	public void start() {
		System.out.println("Kumpula ski jumping week");
		System.out.println();
		System.out.println(
				"Write the names of the participants one at a time; an empty string brings you to the jumping phase.");

		while (true) {
			System.out.print("Participant name: ");
			String name = reader.nextLine();
			if (!name.isEmpty()) {
				addJumper(new Jumper(name));
			} else if (name.isEmpty()) {
				break;
			}
		}
		System.out.println();
		System.out.println("The tournament begins!");

		while (true) {
			System.out.println();
			System.out.println("Write \"jump\" to jump; otherwise you quit: ");
			String command = reader.nextLine();
			if (command.isEmpty()) {
				break;
			} else if (command.equals("jump")) {
				++round;
				System.out.println("Round " + round);
				System.out.println();
				System.out.println("Jumping order: ");
				printJumpers();
				System.out.println();
				System.out.println("Results of round " + round);
				results();
				

			}
		}
	}

}
