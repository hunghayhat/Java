import java.util.Scanner;

public class ViDu {
public static void main(String[] args) {
	// khai báo biến
	int a,b;
	
	// Nhập dữ liệu
	Scanner sc = new Scanner (System.in);
	System.out.println("Nhập vào a = ");
	a = sc.nextInt();
	System.out.println("Nhập vào b =");
	b = sc.nextInt();
	int tong = a + b;
	System.out.println(a+ "+" +b+ "=" +  tong);
}
}
