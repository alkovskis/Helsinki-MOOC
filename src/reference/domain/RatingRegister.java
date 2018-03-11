package reference.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RatingRegister {

	private Map<Film, List<Rating>> filmRatings;
	private Map<Person, Map<Film, Rating>> ratings;

	public RatingRegister() {
		this.filmRatings = new HashMap<Film, List<Rating>>();
		this.ratings=new HashMap<Person, Map<Film,Rating>>();
	}

	public void addRating(Film film, Rating rating) {
		if (!filmRatings.containsKey(film)) {
			filmRatings.put(film, new ArrayList<Rating>());
		}
		filmRatings.get(film).add(rating);
	}

	public List<Rating> getRatings(Film film) {
		return filmRatings.get(film);
	}

	public Map<Film, List<Rating>> filmRatings() {
		return filmRatings;

	}

	public void addRating(Person person, Film film, Rating rating) {
		if (!ratings.containsKey(person)) {
			ratings.put(person, new HashMap<Film, Rating>());
		}
		ratings.get(person).put(film, rating);

	}

	public Rating getRating(Person person, Film film) {
		return ratings.get(person).get(film);

	}

	public Map<Film, Rating> getPersonalRatings(Person person) {
		return ratings.get(person);

	}

	public List<Person> reviewers() {
		List<Person> critics = new ArrayList<Person>();
		for (Person c : ratings.keySet()) {
			critics.add(c);
		}
		return critics;
	}

}
