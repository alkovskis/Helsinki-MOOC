package WeekEight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingBasket {
	private Map<String, Purchase> basket;

	public ShoppingBasket() {
		this.basket = new HashMap<String, Purchase>();
	}

	public void add(String product, int price) {
		if (this.basket.containsKey(product)) {
			this.basket.get(product).increaseAmount();
		} else
			this.basket.put(product, new Purchase(product, 1, price));
	}

	public int price() {
		int price = 0;
		for (Purchase item : this.basket.values()) {
			price += item.price();
		}
		return price;
	}

	public void print() {
		for (Purchase item : this.basket.values()) {
			System.out.println(item);
		}
	}

	public static void main(String[] args) {
		 ShoppingBasket basket = new ShoppingBasket();
	        basket.add("milk", 3);
	        basket.print();
	        System.out.println("basket price: " + basket.price() +"\n");

	        basket.add("buttermilk", 2);
	        basket.print();
	        System.out.println("basket price: " + basket.price() +"\n");

	        basket.add("milk", 3);
	        basket.print();
	        System.out.println("basket price: " + basket.price() +"\n");

	        basket.add("milk", 3);
	        basket.print();
	        System.out.println("basket price: " + basket.price() +"\n");
	            

	}

}
