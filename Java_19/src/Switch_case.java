import java.util.Scanner;

public class Switch_case {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert interger from 0-8: ");
		n =sc.nextInt();
		
		switch (n) {
		case 2: {
			System.out.println("Monday");
			break;
		}
		case 3: {
			System.out.println("Tuesday");
			break;
		}
		case 4: {
			System.out.println("Wednesday");
		}
		case 5: {
			System.out.println("Thursday");
		}
		case 6: {
			System.out.println("Friday");
		}
		case 7: {
			System.out.println("Saturday");
		}case 8: {
			System.out.println("Sunday");
		}
		default:{
			System.out.println("Error");

		}
		}
	}
}
