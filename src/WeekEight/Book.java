package WeekEight;

public class Book implements ToBeStored {
	private String writer;
	private String name;
	private double weight;

	public Book(String writer, String name, double weight) {
		this.writer = writer;
		this.name = name;
		this.weight = weight;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return this.writer+": "+this.name;
	}


	@Override
	public double weight() {
		return this.weight;
	}


	@Override
	public String name() {
		// TODO Auto-generated method stub
		return this.name;
	}

}
