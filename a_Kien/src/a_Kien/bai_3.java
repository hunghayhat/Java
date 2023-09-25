package a_Kien;


import java.util.Random;
import java.util.Scanner;


public class bai_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int answer = random.nextInt(21);
		int attemps = 0;
		
		while (true) {
			System.out.println("Nhap so ma ban doan: ");
			int guess = sc.nextInt();
			attemps++;
		
		if (guess < answer) {
			System.out.println("So ban doan qua nho!");
		}
		else if (guess > answer) {
			System.out.println("So ban doan qua lon");
		}
		else {
			System.out.println("Ban da doan dung, so lan thu = "+attemps);
			break;
		}
		}
	}
}
