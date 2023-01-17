import java.util.Scanner;

public class ViDu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập vào họ và tên:");
		String hoVaTen = sc.nextLine();

		System.out.println("Nhập mã sinh viên:");
		long maSinhVien = sc.nextLong();

		System.out.println("Nhập vào điểm thi:");
		float diemThi = sc.nextFloat();

		System.out.println("-----");
		System.out.println("Họ và tên: "+hoVaTen);
		System.out.println("MSSV: "+maSinhVien);
		System.out.println("Điểm thi: "+ diemThi);
		
	}

}
