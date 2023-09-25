import java.util.Scanner;

public class Quadratic_Equation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Quadratic Equation: a*x^2 + b*x +c =0\n");
		System.out.println("Insert a, b ,c: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();

		double delta = Math.pow(b, 2) - 4 * a * c;
		if (delta < 0)
			System.out.println("Impossible Equation!");
		else if (delta == 0)
			System.out.println("Equation have double solution:\n " + (-b / 2 / a));
		else {
			System.out.println("Equation have:\n");
			System.out.println("x1 = " + (-b + Math.sqrt(delta) / 2 / a));
			System.out.println("x2 = " + (-b - Math.sqrt(delta) / 2 / a));

		}
	}
}
