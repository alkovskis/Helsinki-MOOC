package farmsimulator;

public class MilkingRobot {

	private BulkTank bulkTank;

	public MilkingRobot() {

	}

	public BulkTank getBulkTank() {
		if (this.bulkTank == null) {
			return null;
		} else
			return bulkTank;

	}

	public void setBulkTank(BulkTank tank) {
		this.bulkTank = tank;
	}

	public void milk(Milkable milkable) {
		if (this.getBulkTank() == null) {
			throw new IllegalStateException("The MilkingRobot hasn't been installed");
		} else
			bulkTank.addToTank(milkable.milk());

	}
}
