import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		double a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so a: ");
		a = sc.nextDouble();
		System.out.println("Nhap vao so b: ");
		b = sc.nextDouble();
		System.out.println("|a| = "+ Math.abs(a));
		System.out.println("min(a,b) = " +Math.min(a, b));
		System.out.println("max(a,b) = " +Math.max(a, b));
		
		System.out.println("ceil(a,b) = " + Math.ceil(a));
		
		System.out.println("floor(a,b) = " + Math.floor(a));
		
		System.out.println("sqrt(a) = " + Math.sqrt(a));
		
		// Hàm số mũ
		System.out.println("a ^ b = " + Math.pow(a, b));

	}
}
