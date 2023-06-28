package tuan07;

import java.text.DecimalFormat;

public class SachThamKhao extends Sach {

	private double thue;

	public SachThamKhao(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan, double thue) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		setThue(thue);
	}

	public void setThue(double thue) {
		if (thue > 0)
			this.thue = thue;
		else
			this.thue = 0;
	}

	public double getThue() {
		return this.thue;
	}

	@Override

	public double thanhTien() {
		return super.getDonGia() * super.getSoLuong() + thue;
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###");
		return super.toString() + String.format("%-15s|%-15s|", df.format(thue), df.format(thanhTien()));
	}
}
