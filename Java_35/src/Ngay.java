
public class Ngay {
	private int ngay;
	private int thang;
	private int nam;

	public Ngay(int ngay, int thang, int nam) {
		if (ngay < 1 || ngay > 31)
			this.ngay = 1;
		else
			this.ngay = ngay;
		if (thang > 12 || thang < 1)
			this.thang = 1;
		else
			this.thang = thang;
		if (nam < 1)
			this.nam = 1;
		else
			this.nam = nam;
	}

	public int getNgay() {

		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}

}
