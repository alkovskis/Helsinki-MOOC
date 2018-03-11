package reference.domain;

public class Film {

	private String name;

	public Film(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return getName();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Film)) {
			return false;
		}
		Film film = (Film) obj;
		return film.getName().equals(this.getName());
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

}
