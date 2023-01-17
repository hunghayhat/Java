import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double r, s, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert r:\n ");
		r = sc.nextDouble();
		
		// Chu vi
		c = 2*Math.PI*r;
		System.out.println("c = "+ c);
		
		// Dien tich
		s = Math.PI*Math.pow(r, 2);
		System.out.println("s = "+s);
		System.out.println("Approximately s = " +Math.round(s));
	}

}
