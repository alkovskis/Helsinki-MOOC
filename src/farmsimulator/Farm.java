package farmsimulator;

import java.util.ArrayList;

public class Farm implements Alive {

	private String ownerName;
	ArrayList<Cow> cows = new ArrayList<Cow>();
	private Barn barn;

	public Farm(String ownerName, Barn barn) {
		this.ownerName = ownerName;
		this.barn = barn;
	}
	
	public void installMilkingRobot(MilkingRobot milkingRobot) {
		this.barn.installMilkingRobot(milkingRobot);
		

	}

	public void manageCows() {
		this.barn.takeCareOf(cows);

	}

	public void addCow(Cow cow) {
		cows.add(cow);
	}

	public String getOwner() {
		return this.ownerName;
	}

	public String cows() {
		String answer = "";
		if (cows.size() == 0) {
			answer = "No cows.";
		} else
			answer = "Animals: ";
		for (Cow c : cows) {
			answer += "\n";
			answer += "        " + c.toString();
		}
		return answer;
	}

	@Override
	public void liveHour() {
		for (Cow c : cows) {
			c.liveHour();
		}
	}

	public String toString() {
		return "Farm owner: " + this.ownerName + "\n" + "Barn bulk tank: " + barn.toString() + "\n" + cows();
	}

}
