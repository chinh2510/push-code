package tuan07;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;


public abstract class Sach {

	private String maSach;
	private String ngayNhap;
	private double donGia;
	private int soLuong;
	private String nhaXuatBan;

	public Sach() {

	}

	public Sach(String maSach, String ngayNhap, double donGia, int soLuong, String nhaXuatBan) {
		setMaSach(maSach);
		setNgayNhap(ngayNhap);
		setDonGia(donGia);
		setSoLuong(soLuong);
		setNhaXuatBan(nhaXuatBan);
	}

	public void setMaSach(String maSach) {
		if (!maSach.equals("")) {
			this.maSach = maSach;
		} else
			this.maSach = "";
	}

	public void setNgayNhap(String ngayNhap) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String date = ngayNhap;
		LocalDate localDate = LocalDate.parse(date, df);
		DateTimeFormatter df2 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String format = (LocalDate.now()).format(df2);
		if (localDate.isAfter(LocalDate.now()))
			this.ngayNhap = format;
		else
			this.ngayNhap = ngayNhap;
	}

	public void setDonGia(double donGia) {
		if (donGia > 0) {
			this.donGia = donGia;
		} else
			this.donGia = 0;
	}

	public void setSoLuong(int soLuong) {
		if (soLuong > 0) {
			this.soLuong = soLuong;
		} else
			this.soLuong = 0;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		if (!nhaXuatBan.equals(""))
			this.nhaXuatBan = nhaXuatBan;
		else
			this.nhaXuatBan = "";
	}

	public String getMaSach() {
		return this.maSach;
	}

	public String getNgayNhap() {
		return this.ngayNhap;
	}

	public double getDonGia() {
		return this.donGia;
	}

	public int getSoLuong() {
		return this.soLuong;
	}

	public String getNhaXuatBan() {
		return this.nhaXuatBan;
	}

	public abstract double thanhTien();

	@Override

	public int hashCode() {
		return Objects.hash(maSach);
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sach other = (Sach) obj;
		return Objects.equals(maSach, other.maSach);
	}

	public String toString() {
		DecimalFormat df = new DecimalFormat("#,###");
		return String.format("|%-15s|%-15s|%-15s|%-15s|%-20s|", maSach, ngayNhap, df.format(donGia), df.format(soLuong),
				nhaXuatBan);
	}

}


