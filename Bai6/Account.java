package BaiTapQLTK;

public class Account {
	private long soTK;
	private Sting tenTK;
	private double soTien;
	private String trangthai;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Account(long soTK, Sting tenTK, double soTien) {
		super();
		this.soTK = soTK;
		this.tenTK = tenTK;
		this.soTien = soTien;
	}
	
	public String napTien(double soTiencannap) {
		if(soTiencannap > 0);{
			soTien -= soTiencannap;
			return "Giao dịch nạp tiền thành công";
		}
		else return "Giao dịch nạp tiền thất bại";
	}
	public String ruttien( double soTiencanrut) {
		if(soTiencanrut > 0 && soTiencanrut < soTien) {
			soTien -= soTiencanrut;
			return "Giao dịch rút tiền thanh công";
		}
		else return "Giao dịch rút tiền thất bại"
	}
	
	public String chuyenTien(double soTiencanchuyen, Account acc) {
		if(acc !=null && soTiencanchuyen >0 && soTiencanchuyen < soTien) {
			soTien -= soTiencanchuyen;
			acc.napTien(soTiencanchuyen);
			return "Giao dịch chuyển tiền thành công";
		}
		else return  "Giao dịch chuyển tiền thất bại";
	}
	
	@Override
	public String toString() {
		return String.fomat("%-15d |%-20s |%20f |%-50s|",soTK,
				 tenTK,soTien,trangthai);
	}

	public long getSoTK() {
		return soTK;
	}

	public void setSoTK(long soTK) {
		if(soTK > 0 && soTK !=9999)
		this.soTK = soTK;
		else soTK=999999;
	}

	public Sting getTenTK() {
		return tenTK;
	}

	public void setTenTK(Sting tenTK) {
		if(tenTK != null && tenTK != "")
		this.tenTK = tenTK;
		else tenTK="chua xac dinh";
	}

	public double getSoTien() {
		return soTien;
	}

	public void setSoTien(double soTien) {
		this.soTien = soTien;
	}

	public String getTrangthai() {
		return trangthai;
	}
	
	
}
