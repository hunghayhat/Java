import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Nhap a = ");
		a = sc.nextInt();
		System.out.println("Nhap b = ");
		b = sc.nextInt();
		
		// Xuất kết quả so sánh:
		System.out.println(a + " = " +b + " : "+ (a==b));
		System.out.println(a + " != " +b + " : "+ (a!=b));
		System.out.println(a + " < " +b + " : "+ (a<b));
		System.out.println(a + " > " +b + " : "+ (a>b));
		System.out.println("--------------");
		System.out.println("Cả 2 số là số chẵn: "+(a%2==0 & b%2==0));
	}
}
