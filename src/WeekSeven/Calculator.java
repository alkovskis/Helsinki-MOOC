package WeekSeven;

public class Calculator {
	Reader reader = new Reader();
	int value1 = 0;
	int value2 = 0;
	double answer = 0;
	int cal = 0;

	private void values() {
		System.out.print("value1: ");
		this.value1 = reader.readInteger();
		System.out.print("value2: ");
		this.value2 = reader.readInteger();
	}

	private void sum() {
		values();
		this.answer = this.value1 + this.value2;
		cal++;
		System.out.println("sum of the values " + this.answer);
	}

	private void product() {
		values();
		this.answer = this.value1 * this.value2;
		cal++;
		System.out.println("product of the values " + this.answer);
	}

	private void difference() {
		values();
		this.answer = (double)value1 / value2;
		cal++;
		System.out.println("difference of the values " + this.answer);
	}

	private void statistics() {
		System.out.println("Calculations done " + cal);
	}

	public void start() {
		while (true) {
			System.out.println("command: ");
			String command = reader.readString();
			if (command.equals("end")) {

				break;
			}
			if (command.equals("sum")) {
				sum();
			} else if (command.equals("product")) {
				product();
			} else if (command.equals("difference")) {
				difference();
			}
		}
		statistics();
	}

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.start();
	}

}
