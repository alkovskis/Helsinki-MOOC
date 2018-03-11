package WeekSeven;

import java.util.ArrayList;

public class Changer {
	ArrayList<Change> list= new ArrayList<Change>();

	

	public void addChange(Change change) {
		this.list.add(change);
	}

	public String change(String characterString) {
		String w = characterString;
		for (Change c : list) {
			w = c.change(w);
		}
		return w;

	}

	public static void main(String[] args) {
		Changer scandiesAway = new Changer();
		scandiesAway.addChange(new Change('ä', 'a'));
		scandiesAway.addChange(new Change('ö', 'o'));
		System.out.println(scandiesAway.change("ääliö älä lyö, ööliä läikkyy"));

	}

}
