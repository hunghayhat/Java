
public class MyDate {
	private int day, month, year;

	public MyDate(int d, int m, int y) {
		this.day = d;
		this.month = m;
		this.year = y;
	}
	
	public void printDate() {
		System.out.println("Day: "+this.day);
		System.out.println("Month: "+this.month);
		System.out.println("year: "+this.year);
	}
	public void printDay() {
		System.out.println("Day: "+this.day);
	}
	
}
