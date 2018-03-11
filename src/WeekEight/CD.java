package WeekEight;

public class CD implements ToBeStored {
	private String artist;
	private String title;
	private int publishingYear;
	private final double weight = 0.1;

	public CD(String artist, String title, int publishingYear) {
		this.artist = artist;
		this.title = title;
		this.publishingYear = publishingYear;
	}

	public String toString() {
		return this.artist + ": " + this.title + " (" + this.publishingYear + ")";
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPublishingYear() {
		return publishingYear;
	}

	public void setPublishingYear(int publishingYear) {
		this.publishingYear = publishingYear;
	}

	@Override
	public double weight() {
		return this.weight;
	}

	@Override
	public String name() {
		return this.artist;
	}

}
