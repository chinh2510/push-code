package Bai3Giavang;

public class GdTienTe extends GiaoDich {
	private double tiGia;
	private String loaiTiente;
	
	public GdTienTe(String soLuong, double donGia, String maGD, String ngayGD, double tiGia, String loaiTiente) {
		super(soLuong, donGia, maGD, ngayGD);
		this.tiGia = tiGia;
		this.loaiTiente = loaiTiente;
	}
	
	public double thanhTien() {
		if (loaiTiente.equals("USD")||loaiTiente.equals("Euro")) {
			return soLuong * donGia * tiGia; 
		}
		else {
			return super.thanhTien()
		}
	}
	
	
}
