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
		scandiesAway.addChange(new Change('�', 'a'));
		scandiesAway.addChange(new Change('�', 'o'));
		System.out.println(scandiesAway.change("��li� �l� ly�, ��li� l�ikkyy"));

	}

}
