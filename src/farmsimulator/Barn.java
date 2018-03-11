package farmsimulator;

import java.util.ArrayList;
import java.util.Collection;

public class Barn {

	private BulkTank bulkTank;
	private MilkingRobot robot;

	public Barn(BulkTank tank) {
		this.bulkTank = tank;
	}

	public BulkTank getBulkTank() {
		return this.bulkTank;

	}

	public void installMilkingRobot(MilkingRobot milkingRobot) {
		this.robot = milkingRobot;
		this.robot.setBulkTank(bulkTank);

	}

	public void takeCareOf(Cow cow) {
		if (this.robot == null) {
			throw new IllegalStateException("The milking robot hasn't been installed");
		} else
			this.robot.milk(cow);
	}

	public void takeCareOf(Collection<Cow> cows) {
		if (this.robot == null) {
			throw new IllegalStateException("The milking robot hasn't been installed");
		} else

			for (Cow s : cows) {
				this.robot.milk(s);
			}
	}
	
	

	public String toString() {
		return this.bulkTank.toString();

	}

}
