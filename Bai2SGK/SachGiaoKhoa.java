package tuan07;

import java.text.DecimalFormat;

public class SachGiaoKhoa extends Sach {

	private boolean tinhTrang;

	public SachGiaoKhoa(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan,
			boolean tinhTrang) {
		super(maSach, ngayNhap, donGia, soLuong, nhaXuatBan);
		setTinhTrang(tinhTrang);
	}

	public void setTinhTrang(boolean tinhTrang) {
		if (tinhTrang == true)
			this.tinhTrang = tinhTrang;
		else
			this.tinhTrang = false;
	}

	public boolean getTinhTrang() {
		return this.tinhTrang;
	}

	@Override

	public double thanhTien() {
		if (tinhTrang == true)
			return super.getDonGia() * super.getSoLuong();
		else
			return super.getDonGia() * super.getSoLuong() * 0.5;
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###");
		return super.toString()
				+ String.format("%-15s|%-15s|", tinhTrang == true ? "Mới" : "Cũ", df.format(thanhTien()));
	}
}

