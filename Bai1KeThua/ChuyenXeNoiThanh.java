package Bai1KeThua;

public class ChuyenXeNoiThanh extends ChuyenXe {
	private int soTuyen;
	private int soKm;
	public ChuyenXeNoiThanh() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ChuyenXeNoiThanh (string maSo, string hoTenTX, string soXe, double doanhThu) throws Exception){
		super(maSo, hoTenTX, soXe, doangThu);
		this.soTuyen = soTuyen;
		this.soKm = soKm;	
	}
	
	public int getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}

	public int getSoKm() {
		return soKm;
	}

	public void setSoKm(int soKm) {
		this.soKm = soKm;
	}
}
