package WeekFour;

public class Product {

	private double price;
	private int amount;
	private String name;

	public Product(double price, int amount, String name) {
		this.price = price;
		this.amount = amount;
		this.name = name;
	}
	public String toString() {
		return name+" ,price "+price+" ,amount "+amount;
	} 

	public static void main(String[] args) {
		Product a=new Product(1.1, 13, "Banana");
		System.out.println(a);

	}

}
