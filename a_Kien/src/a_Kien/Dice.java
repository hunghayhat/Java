package a_Kien;

import java.util.Random;

public class Dice {
private int faceValue;
	
	public Dice() {
		//Khởi tạo mặt của xx = 0
		this.faceValue = 0;
	}
	
	public int roll() {
		Random random = new Random();
		this.faceValue = random.nextInt(6) + 1;
		return this.faceValue;
	}
	
	public int getValue() {
		return this.faceValue;
	}
	
	public void setValue (int value) {
		//Thiết lập giá trị của xx bằng giá trị đã cho
		this.faceValue = value;
	}
	
	public static void main(String[] args) {
		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int count = 0;
		
		while (!(dice1.getValue() == 1 && dice2.getValue()==1)) {
			int roll1 = dice1.roll();
			int roll2 = dice2.roll();
			count++;
			
			System.out.println("XX1 = "+ roll1 + ", XX2 = " + roll2);
			
		}
		
	System.out.println("So lan thuc hien de ra ket qua (1,1) la: "+ count);
	}
}
