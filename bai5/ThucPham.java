package bai5;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class ThucPham {
	private String maHang;
	private String tenHang;
	private float donGia;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;
	public void HangThucPham(String maHang, String tenHang, float donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan) throws Exception {
		if (!maHang.trim().equals(""))
			this.maHang = maHang;
		else
			throw new Exception("Lỗi: Mã hàng rỗng!");
		if (!tenHang.trim().equals(""))
			this.tenHang = tenHang;
		else
			this.tenHang = "xxx";
		if (donGia >= 0)
			this.donGia = donGia;
		else
			throw new Exception("Lỗi: Đơn giá bé hơn 0!");
		if (ngaySanXuat.isBefore(LocalDate.now()))
			this.ngaySanXuat = ngaySanXuat;
		else
			this.ngaySanXuat = LocalDate.now();
		if (ngayHetHan.isAfter(ngaySanXuat))
			this.ngayHetHan = ngayHetHan;
		else
			this.ngayHetHan = ngaySanXuat;
	}

	public void setMaHang(String maHang) throws Exception {
		if (!maHang.trim().equals(""))
			this.maHang = maHang;
		else
			throw new Exception("Lỗi: Mã hàng rỗng!");
	}
	public void setTenHang(String tenHang) {
		if (!tenHang.trim().equals(""))
			this.tenHang = tenHang;
		else
			this.tenHang = "xxx";
	}
	public void setDonGia(float donGia) throws Exception{
		if (donGia >= 0)
			this.donGia = donGia;
		else
			throw new Exception("Lỗi: Đơn giá bé hơn 0!");
	}
	public void setNgaySX(LocalDate ngaySanXuat) {
		if (ngaySanXuat.isBefore(LocalDate.now()))
			this.ngaySanXuat = ngaySanXuat;
		else
			this.ngaySanXuat = LocalDate.now();
	}
	public void setNgayHH(LocalDate ngayHetHan) {
		if (ngayHetHan.isAfter(ngaySanXuat))
			this.ngayHetHan = ngayHetHan;
		else
			this.ngayHetHan = ngaySanXuat;
	}
	public String getMaHang() {
		return maHang;
	}
	public String getTenHang() {
		return tenHang;
	}
	public float getDonGia() {
		return donGia;
	}
	public LocalDate getNgaySX() {
		return ngaySanXuat;
	}
	public LocalDate getNgayHH() {
		return ngayHetHan;
	}
	public boolean hetHan() {
		return ngayHetHan.isBefore(LocalDate.now()) ? true : false;
	}
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DecimalFormat df = new DecimalFormat("#,##0.00");
		String ngaysx = dtf.format(ngaySanXuat);
		String ngayhh = dtf.format(ngayHetHan);
		String dongia = df.format(donGia);
		String hethan;
		if(hetHan())hethan = "Hàng hết hạn";
		else hethan = "Hàng còn hạn";
		return String.format("%7s %10s %15s %15s %15s %15s",maHang,tenHang,dongia,ngaysx,ngayhh,hethan);
	}
	
}
