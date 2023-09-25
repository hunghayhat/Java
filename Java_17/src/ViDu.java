import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert interger n: ");
		n = sc.nextInt();
		
		// Kiểm tra tính chẵn lẻ:
		if (n%2 == 0) {
			System.out.println(n + "la so chan");
		}
		else
			System.out.println(n + "la so le");
	}
}
