package WeekEight;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class RichPoor implements Comparable<RichPoor> {

	private String name;
	private int salary;

	public RichPoor(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		return this.name + " salary is " + this.salary;
	}

	

	@Override
	public int compareTo(RichPoor o) {
		if (this.salary == o.salary) {
			return 0;
		} else if (this.salary > o.salary) {
			return -1;
		} else
			return 1;
	}
	public static void main(String[] args) {
		List<RichPoor> a=new ArrayList<RichPoor>();
		a.add(new RichPoor("Arturas", 2000));
		a.add(new RichPoor("Karolis", 1968));
		a.add(new RichPoor("JOnas", 2548));
		a.add(new RichPoor("Marius", 3578));
		System.out.println(a);
		Collections.sort(a);
		System.out.println(a);
		

	}

}
