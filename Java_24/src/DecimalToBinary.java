import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Insert n: ");
		n = sc.nextInt();
		String Binary = "";
		/*
		 * Chia liên tục cho 2, lấy phần dư
		 * Đảo ngược chuỗi, lấy kết quả
		 * 10 : 2 = 5, r = 0
		 * 5:2=2, r =1
		 * 2:2=1, r =0
		 * 1:2 =0, r = 1
		 */
		while(n>0) {
			Binary = (n%2) + Binary;
			n /=2;
		}
		System.out.println("n by Binary: "+Binary);
	}
}
