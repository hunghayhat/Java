
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
		return this.day;
	}

	public void setDay(int d) {
		if (d > 0 && d < 32)
			this.day = d;
	}
}
