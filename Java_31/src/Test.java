
public class Test {
public static void main(String[] args) {
	HoaDonCaFe hd = new HoaDonCaFe("Trung Nguyen", 100, 5.5);
	System.out.println("Tong tien "+hd.tinhTongTien());
	System.out.println("Kiem tra khoi luong > 2kg:" +hd.kiemTraKhoiLuong(2));
	System.out.println("Kiem tra tong tien > 500k: " +hd.kiemTraTongTien());
	System.out.println("Gia tien sau khi giam gia: "+hd.giamGia(15));
}	
}
