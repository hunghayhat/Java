
public class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate(int day, int month, int year) {
		if (day > 31 || day < 1)
			this.day = 1;
		else
			this.day = day;
		if (month > 13 || month < 1)
			this.month = 1;
		else
			this.month = month;
		if (year < 1)
			this.year = 1;
		else
			this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (day > 31 || day < 1)
			this.day = 1;
		else
			this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month > 13 || month < 1)
			this.month = 1;
		else
			this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if (year < 1)
			this.year = 1;
		else
			this.year = year;
	}

	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year; 
	}
}
