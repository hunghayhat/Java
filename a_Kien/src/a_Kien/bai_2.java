package a_Kien;

import java.util.Scanner;

public class bai_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập một số");
//		int choice = sc.nextInt();
		int choice = sc.nextInt();
		
		if (choice == 1) {
			System.out.println("Nhập nhiệt độ theo độ F: ");
//			double doF = sc.nextDouble();
			double doF = sc.nextDouble();
			System.out.println("Nhiệt độ theo độ C là: "+ (doF - 32)*5/9);
		}
		
		else if (choice == 2) {
			System.out.println("Nhập nhiệt độ theo độ C: ");
			double doC = sc.nextDouble();
			System.out.println("Nhiệt độ theo độ F là: "+ (doC *9 / 5 + 32));
		}
		else {
			System.out.println("Lua chon khong hop le, moi chon lai!");
		}
		
	}
}
