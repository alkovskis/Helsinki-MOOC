package WeekEight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {
	private Map<String, Integer> products;
	private Map<String, Integer> stocks;

	public Storehouse() {
		products = new HashMap<String, Integer>();
		stocks = new HashMap<String, Integer>();
	}

	public void addProduct(String product, int price, int stock) {
		this.products.put(product, price);
		this.stocks.put(product, stock);

	}

	public int price(String product) {
		if (this.products.containsKey(product)) {
			return this.products.get(product);
		} else
			return -99;
	}

	public int stock(String product) {
		if (this.stocks.containsKey(product)) {
			return this.stocks.get(product);
		} else
			return 0;
	}

	public boolean take(String product) {
		int n = 0;

		if (this.stocks.containsKey(product)) {
			n = this.stocks.get(product);
			if (n > 0) {
				n--;
				this.stocks.replace(product, n);
				return true;
			} else
				return false;

		}
		return false;
	}
	public Set<String> pro(){
		return products.keySet();
	}

	public static void main(String[] args) {

		Storehouse store = new Storehouse();
        store.addProduct("milk", 3, 10);
        store.addProduct("coffee", 5, 6);
        store.addProduct("buttermilk", 2, 20);
        store.addProduct("jogurt", 2, 20);

        System.out.println("products:");
        for (String product : store.pro()) {
            System.out.println(product);
        }
	}

}
