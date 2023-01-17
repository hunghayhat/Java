
public class HoaDonCaFe {
	private String tenLoaiCaFe;
	private double giaTien1Kg;
	private double khoiLuong;
	
	public HoaDonCaFe(String ten, double gia, double kl ) {
		this.tenLoaiCaFe = ten;
		this.giaTien1Kg = gia;
		this.khoiLuong = kl;
	}
	
	public double tinhTongTien() {
		return this.giaTien1Kg * this.khoiLuong;
	}
	public boolean kiemTraKhoiLuong(double kl) {
		return this.khoiLuong > kl;
	}
	public boolean kiemTraTongTien () {
		return this.tinhTongTien()>500;
	}
	public double giamGia(double x) {
		if (this.tinhTongTien() > 500)
			return this.tinhTongTien()*(1-x/100);
		else 
			return this.tinhTongTien();
	}
}


