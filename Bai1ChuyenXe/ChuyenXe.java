
package Tuan06;

public class ChuyenXe {
	private string maSo;
	private string hoTenTX;
	private string soXe;
	private double doanhThu;
	
	public ChuyenXe() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChuyenXe(string maSo, string hoTenTX, string soXe, double doanhThu) throws Exception {
		super();
		this.maSo = maSo;
		this.hoTenTX = hoTenTX;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}

	public string getMaSo() {
		return maSo;
	}

	public void setMaSo(String maSo) throws Exception {
		if(maSo != null || maSo.trim().length() > 0) this.maSo = maSo;
		else System.out.println(new Exception("Ma so khong hop le"));
	}

	public string getHoTenTX() {
		return hoTenTX;
	}

	public void setHoTenTX(string hoTenTX) {
		this.hoTenTX = hoTenTX;
	}

	public string getSoXe() {
		return soXe;
	}

	public void setSoXe(string soXe) {
		this.soXe = soXe;
	}

	public double getDoanhThu() {
		return doanhThu;
	}

	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}
	
	
	

}
