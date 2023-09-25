import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a = ");
		int a = sc.nextInt();
		
		String ketQua = (a%2 == 2)? "So chan" : "So le";
		System.out.println(+a + " la " + ketQua);
	}
}