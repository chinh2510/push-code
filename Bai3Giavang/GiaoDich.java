package Bai3Giavang;

public class GiaoDich {
	private String soLuong;
	private double donGia;
	private String maGD;
	private String ngayGD;
	
	public GiaoDich() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GiaoDich(String soLuong, double donGia, String maGD, String ngayGD) {
		super();
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.maGD = maGD;
		this.ngayGD = ngayGD;
	}

	public String getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(String soLuong) {
		this.soLuong = soLuong;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public String getMaGD() {
		return maGD;
	}
	public void setMaGD(String maGD) {
		this.maGD = maGD;
	}
	public String getNgayGD() {
		return ngayGD;
	}
	public void setNgayGD(String ngayGD) {
		this.ngayGD = ngayGD;
	}
	
	public double thanhTien() {
		return soLuong * donGia;
		
	}
	
	
	
	
	
}
