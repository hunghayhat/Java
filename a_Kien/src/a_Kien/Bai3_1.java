package a_Kien;

import java.util.Random;

public class Bai3_1 {
	public static void main(String[] args) {
		int[][] array = generate3x5();
		displayArray(array);
	}

	public static int[][] generate3x5() {
		int[][] array = new int[3][5];
		Random random = new Random();

		// Khởi tạo mảng
		for (int i = 0; i < 3; i++)
			for (int j = 0; j < 5; j++) {
				array[i][j] = 0;
			}

		// Chọn ngẫu nhiên 5 vị trí và gán giá trị
		for (int k = 1; k <= 5; k++) {
			int x, y;
			do {
				x = random.nextInt(3);
				y = random.nextInt(5);
			} while (array[x][y] != 0);
			array[x][y] = k;
		}
		return array;
	}

	public static void displayArray(int[][] array) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}
}
