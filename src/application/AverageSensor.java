package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

	ArrayList<Sensor> sensors = new ArrayList<>();
	List<Integer> readings = new ArrayList();

	public void addSensor(Sensor additional) {
		sensors.add(additional);

	}

	@Override
	public boolean isOn() {
		for (Sensor s : sensors) {
			if (s.isOn()) {
				return true;
			}
		}
		return false;
	}

	@Override
	public void on() {
		for (Sensor s : sensors) {
			s.on();
		}

	}

	@Override
	public void off() {
		for (Sensor s : sensors) {
			s.off();
		}

	}

	@Override
	public int measure() {
		if (sensors.size() == 0 || isOn() == false) {
			throw new IllegalStateException();
		}
		int sum = 0;
		int count = 0;
		int avg = 0;
		for (Sensor s : sensors) {
			count++;
			sum += s.measure();
		}
		avg = sum / count;
		readings.add(avg);
		return avg;

	}

	public List<Integer> readings() {
		return readings;

	}

}
