package application;

import java.util.Random;

public class Thermometer implements Sensor {

	private String status = "off";
	Random random = new Random();

	@Override
	public boolean isOn() {
		if (this.status.equals("on")) {
			return true;
		} else
			return false;
	}

	@Override
	public void on() {
		this.status = "on";
	}

	@Override
	public void off() {
		this.status = "off";
	}

	@Override
	public int measure() {
		int number = 0;
		if (this.status.equals("on")) {
			return number = random.nextInt(30 + 1 - (-30)) - 30;
		} else
			throw new IllegalArgumentException("thermometer is off");
	}

}
