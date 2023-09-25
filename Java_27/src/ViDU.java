import java.util.Scanner;

public class ViDU {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		
		try {
			System.out.println("Insert n: ");
			n = sc.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Nhap du lieu sai");
		} finally {
			System.out.println("Hihi");
		}
		
		System.out.println("Gia tri nhap la: "+n);
		System.out.println("End");
	}
}