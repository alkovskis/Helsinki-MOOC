package WeekFour;

import java.util.ArrayList;

public class Menu {

	private ArrayList<String> meals;

	public Menu() {
		this.meals = new ArrayList<String>();
	}

	public void addMenu(String meal) {
		
			if(!this.meals.contains(meal)) {
		this.meals.add(meal);}
	}

	public void printMeals() {
		for (String meal : meals) {
			System.out.println(meal);
		}
	}
	public void clearMenu() {
		this.meals.clear();
		
	}

	public static void main(String[] args) {
		Menu a = new Menu();
		a.addMenu("Hamburger");
		a.addMenu("Fish'n'Chips");
		a.addMenu("Hamburger");
		a.addMenu("Sauerkraut");
		a.printMeals();
		a.clearMenu();
		
		a.printMeals();

	}

}
