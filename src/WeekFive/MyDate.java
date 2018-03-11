package WeekFive;

public class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public String toString() {
		return this.day + "." + this.month + "." + this.year;
	}

	public boolean earlier(MyDate compared) {
		// first we'll compare years
		if (this.year < compared.year) {
			return true;
		}

		// if the years are the same, we'll compare the months
		if (this.year == compared.year && this.month < compared.month) {
			return true;
		}

		// years and months the same, we'll compare the days
		if (this.year == compared.year && this.month == compared.month && this.day < compared.day) {
			return true;
		}

		return false;
	}

	public void advance() {
		this.day++;
		if (this.day > 30) {
			this.day = 1;
			this.month++;
			if (this.month > 12) {
				this.year++;
				this.month = 1;
			}
		}
	}

	public int differenceInYears(MyDate comparedDate) {
		int days = 0;
		int months = 0;
		int years = 0;
		if (this.year >= comparedDate.year) {
			years = this.year - comparedDate.year;
			days = this.day - comparedDate.day;
			months = this.month - comparedDate.month;
		} else {
			years = comparedDate.year - this.year;
			days = comparedDate.day - this.day;
			months = comparedDate.month - this.month;
		}

		if (days < 0) {
			months--;
			if (months < 0) {
				years--;
			}
		}

		return years;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void advance(int numberOfDays) {
		int i = 0;
		while (i < numberOfDays) {
			advance();
			i++;
		}
	}

	public MyDate afterNumberOfDays(int days) {
		MyDate newMyDate = new MyDate(this.day, this.month, this.year);

		newMyDate.advance(days);

		return newMyDate;
	}

	public static void main(String[] args) {
		MyDate first = new MyDate(24, 12, 2009);
		MyDate second = new MyDate(1, 1, 2011);
		MyDate third = new MyDate(25, 12, 2010);

		System.out.println(first + " and " + second + " difference in years: " + second.differenceInYears(first));
		System.out.println(second + " and " + first + " difference in years: " + first.differenceInYears(second));
		System.out.println(first + " and " + third + " difference in years: " + third.differenceInYears(first));
		System.out.println(third + " and " + first + " difference in years: " + first.differenceInYears(third));
		System.out.println(third + " and " + second + " difference in years: " + second.differenceInYears(third));
		System.out.println(second + " and " + third + " difference in years: " + third.differenceInYears(second));
	}

}
